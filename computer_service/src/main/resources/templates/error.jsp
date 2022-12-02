<#assign currentDateTime = .now>

<!DOCTYPE html>

<html lang="en">
<head>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@500;600;700;800;900&display=swap">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,600,700">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:400,800">
    <script src="https://kit.fontawesome.com/4b9ba14b0f.js" crossorigin="anonymous"></script>
    <title>Error 404</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@500;600;700;800;900&display=swap');

        .error-container {
            text-align: center;
            font-size: 106px;
            font-family: 'Catamaran', sans-serif;
            font-weight: 800;
            margin: 70px 15px;
        }
        .error-container > span {
            display: inline-block;
            position: relative;
        }
        .error-container > span.four {
            width: 136px;
            height: 43px;
            border-radius: 999px;
            background:
                    linear-gradient(140deg, rgba(0, 0, 0, 0.1) 0%, rgba(0, 0, 0, 0.07) 43%, transparent 44%, transparent 100%),
                    linear-gradient(105deg, transparent 0%, transparent 40%,
                    rgba(0, 0, 0, 0.06) 41%, rgba(0, 0, 0, 0.07) 76%, transparent 77%, transparent 100%),
                    linear-gradient(to right, #71b7e6, #e54444);
        }
        .error-container > span.four:before,
        .error-container > span.four:after {
            content: '';
            display: block;
            position: absolute;
            border-radius: 999px;
        }
        .error-container > span.four:before {
            width: 43px;
            height: 156px;
            left: 60px;
            bottom: -43px;
            background:
                    linear-gradient(128deg, rgba(0, 0, 0, 0.1) 0%, rgba(0, 0, 0, 0.07) 40%, transparent 41%, transparent 100%),
                    linear-gradient(116deg, rgba(0, 0, 0, 0.1) 0%, rgba(0, 0, 0, 0.07) 50%, transparent 51%, transparent 100%),
                    linear-gradient(to top, #71b7e6, #e54444);
        }
        .error-container > span.four:after {
            width: 137px;
            height: 43px;
            transform: rotate(-49.5deg);
            left: -18px;
            bottom: 36px;
            background: linear-gradient(to right, #71b7e6, #e54444);
        }

        .error-container > span.zero {
            vertical-align: text-top;
            width: 156px;
            height: 156px;
            border-radius: 999px;
            background: linear-gradient(-45deg, transparent 0%, rgba(0, 0, 0, 0.06) 50%,
            transparent 51%, transparent 100%),
            linear-gradient(to top right, #71b7e6, #e54444);
            overflow: hidden;
            animation: bgshadow 5s infinite;
        }
        .error-container > span.zero:before {
            content: '';
            display: block;
            position: absolute;
            transform: rotate(45deg);
            width: 90px;
            height: 90px;
            left: 0;
            bottom: 0;
            background:
                    linear-gradient(95deg, transparent 0%,
                    transparent 8%, rgba(0, 0, 0, 0.07) 9%, transparent 50%, transparent 100%),
                    linear-gradient(85deg, transparent 0%, transparent 19%,
                    rgba(0, 0, 0, 0.05) 20%, rgba(0, 0, 0, 0.07) 91%, transparent 92%, transparent 100%);
        }
        .error-container > span.zero:after {
            content: '';
            display: block;
            position: absolute;
            border-radius: 999px;
            width: 70px;
            height: 70px;
            left: 43px;
            bottom: 43px;
            background: linear-gradient(135deg, #dfd1ea, #e54444) no-repeat;
            box-shadow: -2px 2px 2px 0px rgba(0, 0, 0, 0.1);
        }

        .screen-reader-text {
            position: absolute;
            top: -9999em;
            left: -9999em;
        }

        @keyframes bgshadow {
            0% {
                box-shadow: inset -160px 160px 0px 5px rgba(0, 0, 0, 0.4);
            }
            45% {
                box-shadow: inset 0 0 0 0 rgba(0, 0, 0, 0.1);
            }
            55% {
                box-shadow: inset 0px 0px 0px 0px rgba(0, 0, 0, 0.1);
            }
            100% {
                box-shadow: inset 160px -160px 0px 5px rgba(0, 0, 0, 0.4);
            }
        }

        /* demo stuff */
        * {
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }
        html {
            height: 100%;
        }
        body {
            padding-top: 6em;
            background: linear-gradient(135deg, #dfd1ea, #c44d4d) no-repeat;
            margin-bottom: 50px;
        }
        html, button, input, select {
            font-family: 'Poppins', sans-serif;
            color: #bbb;
        }
        h1 {
            text-align: center;
            margin: 30px 15px;
        }

        .text_area {
            color: #fff;
        }
        .zoom-area {
            max-width: 490px;
            margin: 30px auto 30px;
            font-size: 19px;
            text-align: center;
        }
        .link-container {
            text-align: center;
        }
        a.more-link {
            /*text-transform: capitalize;*/
            font-size: 16px;
            background: linear-gradient(135deg, #71b7e6, #e54444);
            border-radius: 15px;
            padding: 20px 40px;
            color: #fff;
            display: inline-block;
            margin-right: 5px;
            margin-bottom: 5px;
            line-height: 1.5;
            text-decoration: none;
            margin-top: 50px;
            letter-spacing: 1px;
            transition: all 0.6s ease;
            box-shadow: rgba(0, 0, 0, .1) 0 3px 5px -1px,
            rgba(0, 0, 0, .1) 0 6px 10px 0,rgba(0, 0, 0, .1) 0 1px 18px 0;
        }

        a.more-link:hover {
            transform: scale(0.98);
            transition: 0.6s ease-in-out;
            box-shadow: rgba(0, 0, 0, .15) 0 3px 5px -1px,
            rgba(0, 0, 0, .15) 0 6px 10px 0,rgba(0, 0, 0, .15) 0 1px 18px 0;
        }

    </style>
</head>
<body>
<div class="text_area">
    <h1>404 Error Page</h1>
    <p class="zoom-area">Oops... Something happened.</p>
</div>
<section class="error-container">
    <span class="four"><span class="screen-reader-text">4</span></span>
    <span class="zero"><span class="screen-reader-text">0</span></span>
    <span class="four"><span class="screen-reader-text">4</span></span>
</section>
<div class="link-container">
    <a target="_blank" href="https://www.silocreativo.com/en/creative-examples-404-error-css/"
       class="more-link">Visit the original article</a>
</div>
</body>

</html>