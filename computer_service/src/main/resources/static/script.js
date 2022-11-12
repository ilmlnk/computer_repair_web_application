/*
* Dictionary Pattern
* "dictionary_name" : {
*       "ua": "dictionary_name_ua",
*       "eng": "dictionary_name_eng",
*       "pl": "dictionary_name_pl"
* }
*
* */

const lang = {

    /* Ремонт і обслуговування комп'ютерів, ноутбуків, смартфонів та інших гаджетів */
    "home_title": {
        "ua": "Налаштування комп'ютера",
        "eng": "Computer Repair Service",
        "pl": "Naprawa Komputerów"
    },
    "first_diagnostics": {
        "ua": "Перша діагностика - безкоштовно!",
        "eng": "Diagnostics for the first time is free!",
        "pl": "Pierwsza diagnoza jest za darmo!"
    },
    "warranty": {
        "ua": "Гарантія на рік",
        "eng": "One-year warranty"
    }
};

/* Running website title */
function runningTitle() {
    let start_title = document.title;

    for (let i = 0; i < 10; i++) {
        document.title = document.title + '  |  ' + start_title;
    }

    setInterval(function () {
        let running_title = document.title;
        if (running_title.length === 100) {
            running_title = running_title + ' | ' + start_title;
        }
        document.title = running_title.substring(1, running_title.length);
    }, 500);
}

/* To top button */

function showScrollProgress() {
    let calcScrollValue = () => {
        let scrollProgress = document.getElementById("progress");
        let bodyHeight = document.body.offsetHeight;
        let pos = window.scrollY;
        let scrollValue = Math.round((pos * 100) / bodyHeight);
        if (pos > 100) {
            scrollProgress.style.display = "grid";
        } else {
            scrollProgress.style.display = "none";
        }
        document.querySelector('#progress').onclick = () => {
            window.scrollTo({
                top: 0,
                left: 0
            });
        }
        scrollProgress.style.background = `conic-gradient(#4285f4 ${scrollValue}%, #d7d7d7 ${scrollValue}%)`;
    };

    window.onscroll = calcScrollValue;
    window.onload = calcScrollValue;
}


/* Statistics count */
function countStatistics() {

    window.onload = () => {
        let valDisp = document.querySelectorAll(".num");
        let interval = 3000;

        valDisp.forEach((valDisp) => {
            let startValue = 0;
            let endValue = parseInt(valDisp.getAttribute("data-val"));
            let duration = Math.floor(interval / endValue);
            let counter = setInterval(function () {
                startValue += 1;
                valDisp.textContent = startValue;
                if (startValue == endValue) {
                    clearInterval(counter);
                }
            }, duration);
        });
    };
}

// function modalHandler() {
//     document.querySelector("#modal_popup").addEventListener("click", () => {
//         document.querySelector(".modal").classList.add("active");
//     });
//
//     document.querySelector(".modal .close_btn").addEventListener("click", () => {
//         document.querySelector(".modal").classList.remove("active");
//     });
//
//
//     document.getElementsByClassName("create_request").onclick = enterWindow;
// }

runningTitle();
showScrollProgress();
countStatistics();
