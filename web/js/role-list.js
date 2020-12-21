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

$(document).ready(
    function() {
        // 激活导航位置
        setSidebarActive("role-setting");
    });

/**
 * 翻页
 * @param pageNum
 */
function fy(pageNum) {
    var roleName = $('#searchinput').val();
    window.location.href="/recuit/role/role-list.do?pageNum="+pageNum+"&roleName="+roleName;
}

$(document).keyup(function (e) {
    if (e.keyCode == 13) {
        var roleName = $('#searchinput').val();
        window.location.href="/recuit/role/role-list.do?pageNum=1&roleName="+roleName;
    }
});