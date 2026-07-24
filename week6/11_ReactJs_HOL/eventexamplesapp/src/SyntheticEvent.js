import React from "react";

function SyntheticEvent() {

  function handleClick() {
    alert("I was clicked");
  }

  return (
    <div>

      <h2>Synthetic Event Example</h2>

      <button onClick={handleClick}>
        OnPress
      </button>

    </div>
  );
}

export default SyntheticEvent;