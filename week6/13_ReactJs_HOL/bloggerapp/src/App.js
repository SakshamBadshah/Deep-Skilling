import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    return (
        <div>

            <h1>Blogger Application</h1>

            {/* 1. Logical && Rendering */}

            {showBooks && <BookDetails />}

            {/* 2. Ternary Operator */}

            {showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

            {/* 3. Element Variable */}

            {
                (() => {

                    let component;

                    if (showCourses) {
                        component = <CourseDetails />;
                    } else {
                        component = <h3>No Courses</h3>;
                    }

                    return component;

                })()
            }

        </div>
    );
}

export default App;