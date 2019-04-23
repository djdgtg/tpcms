<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Upload</title>
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--jQuery [ REQUIRED ]-->
    <script src="js/jquery-2.2.4.min.js"></script>
    <!--fileinput文件上传  -->
    <link type="text/css" href="plugins/bootstrap-fileinput/css/fileinput.min.css" rel="stylesheet">
    <script type="text/javascript" src="plugins/bootstrap-fileinput/js/fileinput.min.js"></script>
    <script type="text/javascript" src="plugins/bootstrap-fileinput/js/zh.js"></script>
    <script>
        $(function () {
            $("#file").fileinput({
                language: 'zh', //设置语言
                uploadUrl: "resource/upload", //上传的地址
                allowedFileExtensions: ['pdf', 'epub', 'dbz'],//接收的文件后缀
                uploadAsync: true, //默认异步上传
                showUpload: true, // 是否显示上传按钮
                showRemove: true, // 是否显示移除按钮
                showCaption: false,
                dropZoneEnabled: false,
                validateInitialCount: true,// 验证初始计数,默认false
                maxFileSize: 0,// 单位为kb，如果为0表示不限制文件大小
                maxFileCount: 10, //表示允许同时上传的最大文件个数
                previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
                enctype: 'multipart/form-data',
            }).on('filepreupload', function (event, data, previewId, index) {     //上传中
                console.log('文件正在上传');
            }).on("fileuploaded", function (event, data, previewId, index) {    //一个文件上传成功
                console.log(data);
            }).on('fileerror', function (event, data, msg) {  //一个文件上传失败
                console.log(data);
            })
        })

    </script>
</head>
<body>
<input type="file" data-show-caption="true" multiple name="file" id="file"/>
</body>
</html>