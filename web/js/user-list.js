$(document).ready(function() {
    // 选择框
    $(".select2").select2();

    // WYSIHTML5编辑器
    $(".textarea").wysihtml5({
        locale : 'zh-CN'
    });
});

// 设置激活菜单
function setSidebarActive(tagUri) {
    var liObj = $("#" + tagUri);
    if (liObj.length > 0) {
        liObj.parent().parent().addClass("active");
        liObj.addClass("active");
    }
}

$(document)
    .ready(
        function() {
            // 激活导航位置
            setSidebarActive("user-setting");

        });

/**
 * 翻页
 * @param pageNum
 */
function fy(pageNum) {
    var pageSize = $('#pagesize').val();
    window.location.href="/recuit/user/user-list.do?pageNum="+pageNum+"&pageSize="+pageSize;
}

/**
 * select标签绑定事件
 */
$(document).ready(function(){
    $('#pagesize').change(function(){
        var pageSize = $('#pagesize').val();
        window.location.href="/recuit/user/user-list.do?pageNum=1&pageSize="+pageSize+"&username=";
    })
})


$(document).keyup(function (e) {
    if (e.keyCode == 13) {
        var username = $('#searchinput').val();
        var pageSize = $('#pagesize').val();
        window.location.href="/recuit/user/user-list.do?pageNum=1&pageSize="+pageSize+"&username="+username;
    }
});