import React from "react";

export default function ApplyForm() {
  return (
    <>
      <iframe
        src="https://docs.google.com/forms/d/e/1FAIpQLSfvQZBIU7qTZw7t4rraK6H3SMgicVeRXQDSGgz0DpelszLyMg/viewform?embedded=true"
        width="1600"
        height="1000"
        frameborder="0"
        marginheight="0"
        marginwidth="0"
      >
        Yükleniyor…
      </iframe>
      <a href="/">
            <button className="btn" navigate="/">
              Geri dön
            </button>
          </a>
    </>
  );
}
