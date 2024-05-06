let btn = document.querySelector("#search");
let input = document.querySelector("#input");

btn.addEventListener("click", function () {
  if (input.style.display === "block") {
    input.style.display = "none";
  } else {
    input.style.display = "block";
  }
});

let show = document.querySelector("#btn");
let sidebar = document.querySelector("#sidebar");
let hide = document.querySelector("#check");

show.addEventListener("click", function () {
  if (sidebar.style.display === "block") {
    sidebar.style.display = "none";
  } else {
    sidebar.style.display = "block";
  }
});

hide.addEventListener("click", function () {
  if (sidebar.style.display === "block") {
    sidebar.style.display = "none";
  } else {
    sidebar.style.display = "block";
  }
});
