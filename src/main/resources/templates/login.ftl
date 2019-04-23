<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--Nifty Stylesheet [ REQUIRED ]-->
    <link href="css/nifty.min.css" rel="stylesheet">
    <!--Demo [ DEMONSTRATION ]-->
    <link href="css/demo/nifty-demo.min.css" rel="stylesheet">
    <!--Font Awesome [ OPTIONAL ]-->
    <link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!--validator [ OPTIONAL ]-->
    <link href="plugins/bootstrap-validator/bootstrapValidator.min.css" rel="stylesheet">
    <!--jQuery [ REQUIRED ]-->
    <script src="js/jquery-2.2.4.min.js"></script>
    <!--BootstrapJS [ RECOMMENDED ]-->
    <script src="js/bootstrap.min.js"></script>
    <!--Background Image [ DEMONSTRATION ]-->
    <script src="js/bg-images.js"></script>
    <!--validator [ OPTIONAL ]-->
    <script src="plugins/bootstrap-validator/bootstrapValidator.min.js"></script>
    <!--bootbox [ OPTIONAL ]-->
    <script src="plugins/bootbox/bootbox.min.js"></script>
    <script>
        $(function () {
            $('#loginForm').bootstrapValidator({
                feedbackIcons: {
                    valid: 'fa fa-check-circle fa-lg text-success',
                    invalid: 'fa fa-times-circle fa-lg',
                    validating: 'fa fa-refresh'
                },
                fields: {
                    'loginName': {
                        message: '用户名不能为空',
                        validators: {
                            notEmpty: {
                                message: '用户名不能为空.'
                            }
                        }
                    },
                    'password': {
                        message: '密码不能为空',
                        validators: {
                            notEmpty: {
                                message: '密码不能为空.'
                            }
                        }
                    }
                }
            }).on('success.field.bv', function(e, data) {
                var $parent = data.element.parents('.form-group');
                $parent.removeClass('has-success');
            }).on('success.form.bv', function(e) {
                e.preventDefault();
                var $form = $(e.target);
                $form.data('bootstrapValidator');
                login();
            });
        })

        function login() {
            $.ajax({
                url: 'user/login',
                method: 'get',
                data: $('#loginForm').serialize(),
                success: function (result) {
                    if (result.status == 200) {
                        window.location.href = 'index.html';
                    } else {
                        bootbox.alert(result.msg);
                        return;
                    }
                },
            });
        }
    </script>
</head>
<body>

<div id="container" class="cls-container">
    <!-- BACKGROUND IMAGE -->
    <!--===================================================-->
    <div id="bg-overlay" class="bg-img img-balloon"></div>
    <!-- HEADER -->
    <!--===================================================-->
    <div class="cls-header cls-header-lg">
        <div class="cls-brand">
            <a class="box-inline" href="index.html">
                <span class="brand-title">Nifty <span class="text-thin">Admin</span></span>
            </a>
        </div>
    </div>
    <!--===================================================-->
    <!-- LOGIN FORM -->
    <!--===================================================-->
    <div class="cls-content">
        <div class="cls-content-sm panel">
            <div class="panel-body">
                <p class="pad-btm">Sign In to your account</p>
                <form id="loginForm">
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon"><i class="icon-user"></i></div>
                            <input type="text" class="form-control" placeholder="loginName" name="loginName">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon"><i class="icon-lock"></i></div>
                            <input type="password" class="form-control" placeholder="password" name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="text-left">
                            <label class="form-icon">
                                <input type="checkbox" name="autoLogin"> 自动登录
                            </label>
                        </div>
                    </div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">
                        Login
                    </button>
                </form>
            </div>
        </div>
    </div>
    <!--===================================================-->
    <!-- DEMO PURPOSE ONLY -->
    <!--===================================================-->
    <div class="demo-bg">
        <div id="demo-bg-list">
            <div class="demo-loading"><i class="fa fa-refresh"></i></div>
            <img class="demo-chg-bg bg-trans" src="img/bg-img/thumbs/bg-trns.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-1.jpg" alt="Background Image">
            <img class="demo-chg-bg active" src="img/bg-img/thumbs/bg-img-2.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-3.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-4.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-5.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-6.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-7.jpg" alt="Background Image">
        </div>
    </div>
    <!--===================================================-->
</div>
<!--===================================================-->
<!-- END OF CONTAINER -->
</body>
</html>