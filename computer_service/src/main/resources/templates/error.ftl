<#--
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css"/>
    <title>${title}</title>
</head>
<body>
<div class="container">
    <div class="jumbotron alert-danger">
        <h1>Oops. Something went wrong</h1>
        <h2>${status} ${error}</h2>
    </div>
</div>
</body>

</html>-->

<#import "parts/common.ftl" as c>

<@c.main_page>
    <title>${error}</title>

</@c.main_page>