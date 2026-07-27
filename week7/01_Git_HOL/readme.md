Hands-on Lab: Git Configuration
Objective

Get familiar with Git commands such as git init, git status, git add, git commit, git push, and git pull. Configure Git, integrate Notepad++ as the default editor, create a local repository, and push it to a remote GitLab repository.

Step 1: Setup Machine with Git Configuration

1.1 Verify Git Client is Installed
$ git --version

Output

git version 2.52.0.windows.1

Git is installed successfully because the command displays the installed Git version.

1.2 Configure User-Level Git Identity
git config --global user.name "Name"
git config --global user.email "your@gmail.com"
1.3 Verify Git Configuration
$ git config --global --get user.name

Output

Naman
$ git config --global --get user.email

Output

your@gmail.com

The global Git username and email are configured successfully. All future commits from this machine will use this identity.

1.4 Create the Remote Repository (GitLab)

Create a personal GitLab account.

Create a new blank project named:

GitDemo1

Copy the HTTPS repository URL.

Example:

https://gitlab.com/Naman9528/gitdemo1.git
Step 2: Configure Notepad++ as Git Default Editor
2.1 Verify Notepad++

Initially,

$ notepad++

Output

'notepad++' is not recognized as an internal or external command

The Notepad++ installation path was added to the Windows Environment Variables.

After reopening Git Bash,

$ notepad++

Notepad++ opened successfully.

2.2 Configure Notepad++ as Default Git Editor
git config --global alias.np '!notepad++'
git config --global core.editor "notepad++"
2.3 Verify Configuration
git config --global -e

Output

The .gitconfig file opened in Notepad++, confirming that Notepad++ is configured as Git's default editor.

Step 3: Create a Local Repository
3.1 Initialize Repository
mkdir GitDemo
cd GitDemo
git init --initial-branch=main

Output

Initialized empty Git repository in .../GitDemo/.git/
3.2 Create a File
echo "Welcome to the version control" >> welcome.txt
3.3 Check Repository Status
git status

Output

On branch main

No commits yet

Untracked files:
    welcome.txt

The file exists in the working directory but is not yet tracked by Git.

3.4 Add File to Staging Area
git add .
3.5 Verify Staging Area
git status

Output

Changes to be committed:

    new file: welcome.txt

The file has been successfully staged.

3.6 Commit Changes
git commit -m "Added welcome.txt file"

Output

[main (root-commit) 27b4187] Added welcome.txt file
1 file changed, 1 insertion(+)
create mode 100644 welcome.txt

The file has been committed successfully.

3.7 View Commit History
git log --oneline

Output

27b4187 Added welcome.txt file
Step 4: Connect Local Repository to GitLab
4.1 Add Remote Repository
git remote add origin https://gitlab.com/Naman9528/gitdemo1.git
4.2 Verify Remote Repository
git remote -v

Output

origin  https://gitlab.com/Naman9528/gitdemo1.git (fetch)
origin  https://gitlab.com/Naman9528/gitdemo1.git (push)
Step 5: Push Files to GitLab
git push --set-upstream origin main

Output

Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0

To https://gitlab.com/Naman9528/gitdemo1.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

The local repository has been successfully pushed to GitLab.

Step 6: Verify Repository Status
git status

Output

On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean

The local repository and the remote repository are synchronized successfully.

Step 7: Pull Changes from GitLab
git pull origin main

Output

Already up to date.

Git confirms that the local repository already contains the latest changes.

Summary of Commands Covered
Command	Purpose
git --version	Verify Git installation
git config --global user.name	Configure Git username
git config --global user.email	Configure Git email
git config --global --get	Verify Git configuration
git config --global core.editor	Set Notepad++ as default editor
git init --initial-branch=main	Initialize a new Git repository
git status	View repository status
git add .	Stage all files
git commit -m	Commit staged files
git log --oneline	Display commit history
git remote add origin	Connect local repository to GitLab
git remote -v	Display remote repository information
git push --set-upstream origin main	Push local commits to GitLab
git pull origin main	Pull latest changes from GitLab