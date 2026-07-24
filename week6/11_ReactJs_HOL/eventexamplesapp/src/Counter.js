import React, { Component } from "react";

class Counter extends Component {

  constructor() {
    super();

    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayHello = () => {
    alert("Hello! Have a nice day.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  render() {
    return (
      <div>
        <h2>Counter Example</h2>

        <h3>{this.state.count}</h3>

        <button onClick={this.handleIncrement}>
          Increment
        </button>

        <button onClick={this.decrement}>
          Decrement
        </button>

      </div>
    );
  }
}

export default Counter;