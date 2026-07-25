function FlightDetails() {
    return (
        <div>
            <h2>Flight Details</h2>

            <table border="1">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Fare</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Delhi</td>
                        <td>Mumbai</td>
                        <td>₹4500</td>
                    </tr>

                    <tr>
                        <td>AI202</td>
                        <td>Bangalore</td>
                        <td>Chennai</td>
                        <td>₹3200</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default FlightDetails;