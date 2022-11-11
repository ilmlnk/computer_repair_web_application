<#import "../templates/index.ftl" as spring/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Computer Repair - Fast, Reliable, Affordable</title>

    <!-- Shortcut Icon -->
    <link rel="shortcut icon" href="" type="image/x-icon">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap"
          rel="stylesheet"/>

    <!-- JS scripts -->
    <script type="text/javascript" src="../static/script.js"></script>
    <!-- Подключение jQuery плагина Masked Input -->
    <script src="../static/jquery-3.6.1.js"></script>
    <script src="../static/jquery.maskedinput.js"></script>

    <!-- CSS -->
    <link href="../static/style.css" rel="stylesheet" crossorigin="anonymous">

    <!-- FontAwesome Icons -->
    <!-- https://fontawesome.com/icons -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"/>
</head>


<div class="modal" id="modal_popup">
    <div class="modal_window">
        <div class="modal_window_header">
            <div class="close_btn" id="close">&times;</div>
            <h2>Create request</h2>
            <p>Leave your contacts and we will go around in short time!</p>
        </div>
        <div class="modal_window_content">

            <fieldset>
                <form class="modal_form" action="#" method="post">

                    <div class="modal_name_container field_container">
                        <input class="form_control user_name" id="name_text_field"
                               type="text" name="name" placeholder="Your first name">
                    </div>

                    <div class="modal_surname_container field_container">
                        <input class="form_control user_surname" id="surname_text_field"
                               type="text" name="surname" placeholder="Your last name">
                    </div>

                    <div class="modal_phone_container field_container">
                        <input class="form_control user_phone_number" id="phone_number_text_field"
                               type="text" name="phone" placeholder="Your phone number">
                    </div>
                </form>

                <div class="modal_window_footer">
                    <!-- Cancel Button -->
                    <button type="button" class="btn btn-primary cancel_button"
                            data-toggle="modal" data-target="#modal"
                            data-whatever="@mdo">Cancel
                    </button>

                    <!-- Accept Button -->
                    <button type="button" class="btn btn-primary accept_button"
                            data-toggle="modal" data-target="#modal"
                            data-whatever="@mdo">Send
                    </button>
                </div>
            </fieldset>
        </div>
    </div>

    <script>
        $(function ($) {
            $('#phone_number_text_field').mask("+38(099) 999-99-99");
        });
    </script>
</div>


<body id="main_content">

<!-- Back-To-Top Button with Scroll Progress -->
<div id="progress">
    <i class='bx bxs-chevron-up' id="progress-value"></i>
</div>

<!-- Sidebar Navigation Panel -->


<!-- Main Wrapper -->
<div class="main_wrapper">
    <!-- Home Wrapper -->
    <div class="home_wrapper">

        <!-- Home title -->
        <div class="home_content content">
            <!-- Website logotype -->
            <div id="home" class="logo">
                <h2 class="logo_name">Logo</h2>
            </div>
            <h1 class="main_title">Computer Service: computers, laptops and other gadgets</h1>

            <!-- Crucial Pros Wrapper -->
            <div class="crucial_pros_wrapper">

                <div class="crucial_pros_container">
                    <i class='bx bxs-building-house crucial_pros'></i>
                    <span class="text">On home or office</span>
                </div>

                <div class="crucial_pros_container">
                    <i class='bx bxs-badge-check crucial_pros'></i>
                    <span class="text">One-year warranty</span>
                </div>

                <div class="crucial_pros_container">
                    <i class='bx bx-search-alt crucial_pros'></i>
                    <span class="text">First diagnostics for free</span>
                </div>

                <div class="crucial_pros_container c">
                    <i class='bx bxs-business crucial_pros'></i>
                    <span class="text">Working with B2B</span>
                </div>
            </div>

            <button type="button" class="create_request btn btn-primary home_request"
                    data-toggle="modal" data-target="#modalWindow"
                    data-whatever="@mdo">Leave Request
            </button>

        </div>
    </div>


    <!-- About Us Wrapper-->
    <div class="about_us_wrapper" id="about_us">

        <div class="about_us_content content">
            <!-- About Us title -->
            <!-- Special features in About Us -->
            <div class="about_us_features_wrapper">
                <h1 class="title_about_us">About us</h1>
                <!-- About Us #1 -->
                <div class="about_us_feature_container">
                    <ul class="about_us_features_list about_us_features_first_list">
                        <li class="feature_mark">We have a second-year experience in repairing and configuring gadgets
                        </li>
                        <li class="feature_mark">The most affordable prices in entire Ukraine</li>
                        <li class="feature_mark">Service centres are located in 30 cities in Ukraine</li>
                    </ul>
                </div>

                <!-- About Us #2 -->
                <div class="about_us_feature_container">
                    <ul class="about_us_features_list about_us_features_second_list">
                        <li class="about_us_mark">We have only certified and high-qualified specialists</li>
                        <li class="about_us_mark">Wide service range</li>
                        <li class="about_us_mark">10% of the service cost we donate to the Military Forces of Ukraine
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <!-- Services block -->
    <div class="service_wrapper" id="service">
        <!-- Service cards -->
        <h1 class="service_title">Available Services</h1>
        <div class="service_container content">
            <!-- Service card Windows -->
            <div class="service_card_windows service_card windows">
                <i class='bx bxl-windows'></i>
                <h2 class="service_card_title windows_card_title">Operating Systems</h2>
                <ul class="service_list windows_list">
                    <li class="service_mark windows_mark">Installing/reinstalling Windows (any version)</li>
                    <li class="service_mark windows_mark">Windows Configuration</li>
                    <li class="service_mark windows_mark">Windows Recovering</li>
                    <li class="service_mark windows_mark">Troubleshooting</li>
                    <li class="service_mark windows_mark">BIOS configuration</li>
                </ul>
            </div>

            <!-- Service card Laptops and Computers -->
            <div class="service_card_laptops_and_computers service_card laptops_and_computers">
                <i class='bx bx-desktop'></i>
                <h2 class="service_card_title laptops_and_computers_title">Laptops and Computers</h2>
                <!-- Service List "Laptops and Computer" -->
                <ul class="service_list laptops_and_computers_list">
                    <li class="service_mark laptops_and_computers_mark">Dust cleansing and Thermal Paste replacement
                    </li>
                    <li class="service_mark laptops_and_computers_mark">Computer diagnostics</li>
                    <li class="service_mark laptops_and_computers_mark">Replacing and Installing components</li>
                    <li class="service_mark laptops_and_computers_mark">Building PC</li>
                </ul>
            </div>

            <!-- Service card Software Installation -->
            <div class="service_card software_installation">
                <i class='bx bxs-category'></i>
                <h2 class="service_card_title software_title">Installing Software</h2>
                <!-- Service List "Software Installation" -->
                <ul class="service_list software_list">
                    <li class="service_mark software_mark">Installing all important programs</li>
                    <li class="service_mark software_mark">Installing Microsoft Office</li>
                    <li class="service_mark software_mark">Antivirus installing</li>
                    <li class="service_mark software_mark">Anti-ad installing</li>
                    <li class="service_mark software_mark">Parent Control installing</li>
                </ul>
            </div>

            <!-- Service card Gadgets -->
            <div class="service_card gadgets">
                <i class='bx bx-devices'></i>
                <h2 class="service_card_title gadgets_title">Gadgets</h2>
                <!-- Service List "Gadgets" -->
                <ul class="service_list gadgets_list">
                    <li class="service_mark gadgets_mark">Smartphone and Tablet Repair</li>
                    <li class="service_mark gadgets_mark">Installing Software</li>
                    <li class="service_mark gadgets_mark">Antivirus and Anti-ad installing</li>
                    <li class="service_mark gadgets_mark">Smartphone and Tablet Diagnostics</li>
                </ul>
            </div>

            <!-- Service card Internet -->
            <div class="service_card internet">
                <i class='bx bx-globe'></i>
                <h2 class="service_card_title internet_title">Internet</h2>
                <ul class="service_list internet_list">
                    <li class="service_mark internet_mark">Connecting to the Internet</li>
                    <li class="service_mark internet_mark">Wi-Fi configuration</li>
                    <li class="service_mark internet_mark">Router installing</li>
                </ul>
            </div>

            <!-- Service card Advanced -->
            <div class="service_card advanced">
                <i class='bx bx-cloud-rain'></i>
                <h2 class="service_card_title advanced_title">Advanced</h2>
                <ul class="service_list advanced_list">
                    <li class="service_mark advanced_mark">Server installing</li>
                    <li class="service_mark advanced_mark">Consultations</li>
                    <li class="service_mark advanced_mark">CCTV installing</li>
                    <li class="service_mark advanced_mark">Cloud setup</li>
                </ul>
            </div>
        </div>
    </div>

    <!-- Contact Us block -->
    <div class="contact_us_wrapper">
        <div class="contact_us_content content">
            <!-- Contact Us text -->
            <div class="contact_us_content">
                <h1>You will have your PC configured today!</h1>
                <p>Simply leave your request and we will contact you after while.</p>
            </div>

            <button type="button" class="create_request btn btn-primary contact_us" data-toggle="modal"
                    data-target="#exampleModal"
                    data-whatever="@mdo">Leave Request
            </button>
        </div>
    </div>

    <!-- Prices block -->
    <div class="prices_wrapper" id="prices">
        <div class="prices_content content">
            <h1>Prices</h1>
            <!-- Prices block bodies -->
            <div class="prices_block_content">
                <!-- Prices block body Windows -->
                <div class="prices_block windows">
                    <h5 class="title_block windows">Installing or Configuration</h5>
                    <h5 class="title_block windows">Price</h5>
                    <!-- All service list -->
                    <div class="prices_container_windows prices_container windows">
                        <!-- Grouped elements Service Name and Service Price -->
                        <div class="service_block windows">
                            <!-- Service Name label -->
                            <p class="service_name service_name_windows windows">Windows</p>
                            <!-- Service Price label -->
                            <p class="service_price service_price_windows windows">149₴</p>
                        </div>
                    </div>
                    <div class="prices_container_systems systems">
                        <div class="service_block_systems systems">
                            <p class="service_name_systems systems">MacOS, Ubuntu, Linux etc.</p>
                            <p class="service_price_systems systems">199₴</p>
                        </div>
                    </div>
                    <div class="prices_container_bios prices_container bios">
                        <div class="service_block bios">
                            <p class="service_name_bios service_name bios">BIOS Configuration</p>
                            <p class="service_price_bios service_price bios">79₴</p>
                        </div>
                    </div>
                    <div class="prices_container prices_container_configuration configuration">
                        <div class="service_block service_block_configuration configuration">
                            <p class="service_name service_name_configuration configuration">
                                Recovering Windows, configuring Windows, troubleshooting</p>
                            <p class="service_price service_price_configuration windows">99₴</p>
                        </div>
                    </div>
                    <div class="prices_container prices_container_windows">
                        <div class="service_block windows">
                            <p class="service_name windows">MacOS, Ubuntu, Linux configuration</p>
                            <p class="service_price windows">129₴</p>
                        </div>
                    </div>

                </div>
                <!-- Prices block body Computers -->
                <div class="prices_block prices_computers computers">

                </div>
                <!-- Prices block body Installing Software -->
                <div class="prices_block prices_software software">

                </div>
                <!-- Prices block body Gadgets -->
                <div class="prices_block prices_gadgets gadgets">

                </div>
                <!-- Prices block body Internet -->
                <div class="prices_block prices_internet internet">

                </div>
                <!-- Prices block body Advanced -->
                <div class="prices_block_advanced prices_advanced advanced">

                </div>
            </div>
        </div>
    </div>

    <!-- Block "We are Trusted!" -->
    <div class="we_are_trusted_wrapper" id="stat">
        <div class="we_are_trusted_content content">
            <h1>We are trusted!</h1>
            <div class="special_feature_wrapper">

                <div class="special_feature_container">
                    <i class='bx bx-laptop we_are_trusted'></i>
                    <span class="num" data-val="1242">0000</span>
                    <span class="text">Repaired laptops</span>
                </div>

                <div class="special_feature_container">
                    <i class='bx bxs-wink-smile we_are_trusted'></i>
                    <div class="num_with_sign">
                        <span class="num" data-val="91">00</span>
                        <span class="num_sign">%</span>
                    </div>
                    <span class="text">Customer satisfactory</span>
                </div>

                <div class="special_feature_container">
                    <i class='bx bxs-wrench we_are_trusted'></i>
                    <div class="num_with_sign">
                        <span class="num" data-val="20">00</span>
                        <span class="num_sign">+</span>
                    </div>
                    <span class="text">Services</span>
                </div>

                <div class="special_feature_container">
                    <i class='bx bxs-city we_are_trusted'></i>
                    <span class="num" data-val="30">00</span>
                    <span class="text">Offices in Ukraine</span>
                </div>
            </div>
        </div>
    </div>
    <!--  -->
    <div class="">
        <div class="contact_us_content content">
            <div>
                <h2>Доверьте ремонт вашего компьютера профессионалам!</h2>
                <p>Заказывайте услуги прямо сейчас!</p>
            </div>
            <button type="button" class="create_request btn btn-primary" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="@mdo">Leave Request
            </button>
        </div>
    </div>
</div>

<footer class="footer_end">
    <div class="footer_wrapper">
        <div class="footer_content content">
            <div>
                <div>
                    <h2>Technologies used in Developing</h2>
                    <div class="">
                        <ul>
                            <li>HTML5/CSS/JavaScript</li>
                            <li>Java Core</li>
                            <li>Spring Framework</li>
                            <li>Thymeleaf</li>
                            <li>PostgreSQL</li>
                            <li>Lombok</li>
                            <li>Liquibase</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div>
                <h2>About Author</h2>
                <p>I am a diligent Java Developer, and I am so excited to gain my first commercial experience
                    in this field. </p>
            </div>

            <div class="social_media_wrapper">
                <h2>Contact Me</h2>
                <div class="social_media_container">
                    <ul class="social_media_list">
                        <li class="social_media_mark telegram">
                            <a href="https://t.me/ilmlnk" class="link_social_media telegram">
                                <i class='bx bxl-telegram'></i>
                            </a> <!-- Telegram -->
                        </li>
                        <li class="social_media_mark github">
                            <a href="https://github.com/ilmlnk" class="link_social_media github">
                                <i class='bx bxl-github'></i>
                            </a> <!-- GitHub -->
                        </li>
                        <li class="social_media_mark instagram">
                            <a href="https://instagram.com/ilmlnk" class="link_social_media instagram">
                                <i class='bx bxl-instagram'></i>
                            </a> <!-- Instagram -->
                        </li>
                        <li class="social_media_mark facebook">
                            <a href="https://facebook.com/ilmlnk" class="link_social_media facebook">
                                <i class='bx bxl-facebook-circle'></i>
                            </a> <!-- Facebook -->
                        </li>
                        <li class="social_media_mark gmail">
                            <a href="" class="link_social_media gmail">
                                <i class='bx bxl-gmail'></i>
                            </a> <!-- Gmail -->
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</footer>


<!-- Optional JS scripts -->

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</body>
</html>