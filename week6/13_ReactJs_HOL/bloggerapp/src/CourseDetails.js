function CourseDetails() {

    const courses = [
        {
            id: 1,
            name: "Java Full Course"
        },
        {
            id: 2,
            name: "ReactJS"
        },
        {
            id: 3,
            name: "Spring Boot"
        }
    ];

    return (
        <div>

            <h2>Course Details</h2>

            <ul>

                {
                    courses.map(course => (
                        <li key={course.id}>
                            {course.name}
                        </li>
                    ))
                }

            </ul>

        </div>
    );
}

export default CourseDetails;