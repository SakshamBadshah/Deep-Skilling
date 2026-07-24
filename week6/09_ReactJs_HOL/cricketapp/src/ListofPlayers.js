import React from "react";

function ListofPlayers() {

    const players = [
        {name:"Virat", score:90},
        {name:"Rohit", score:80},
        {name:"Gill", score:65},
        {name:"Rahul", score:72},
        {name:"Pant", score:55},
        {name:"Hardik", score:77},
        {name:"Jadeja", score:60},
        {name:"Ashwin", score:68},
        {name:"Shami", score:75},
        {name:"Bumrah", score:95},
        {name:"Siraj", score:50}
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>

            <h2>List of Players</h2>

            <table border="1">
                <tr>
                    <th>Name</th>
                    <th>Score</th>
                </tr>

                {players.map((player,index)=>(
                    <tr key={index}>
                        <td>{player.name}</td>
                        <td>{player.score}</td>
                    </tr>
                ))}
            </table>

            <h2>Players having score below 70</h2>

            <ul>
                {
                    below70.map((player,index)=>(
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>

        </div>
    );
}

export default ListofPlayers;