import React, { useEffect, useState } from "react";
import "./flag.css";

const FlagIntro = () => {
  const [showText, setShowText] = useState(false);

  useEffect(() => {
    // Show "I VOTE" text after 3 seconds
    const timer = setTimeout(() => setShowText(true), 3000);
    return () => clearTimeout(timer);
  }, []);

  return (
    <div className="flag-intro">
      <div className={`flag ${showText ? "show-text" : ""}`}>
        {showText && <div className="flag-text">I VOTE</div>}
      </div>
    </div>
  );
};

export default FlagIntro;
