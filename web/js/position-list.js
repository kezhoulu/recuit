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

$(document).ready(function() {

    // 激活导航位置
    setSidebarActive("system-zwsq");

});


/**
 * 翻页
 * @param pageNum
 */
function fy(pageNum) {
    var pageSize = $('#pagesize').val();
    window.location.href="/recuit/position-offer/position-offer-list.do?pageNum="+pageNum+"&pageSize="+pageSize+"&gwmc=";
}

/**
 * select标签绑定事件
 */
$(document).ready(function(){
    $('#pagesize').change(function(){
        var pageSize = $('#pagesize').val();
        var gwmc = $('#searchinput').val();
        window.location.href="/recuit/position-offer/position-offer-list.do?pageNum=1&pageSize="+pageSize+"&gwmc="+gwmc;
    })
})


$(document).keyup(function (e) {
    if (e.keyCode == 13) {
        var gwmc = $('#searchinput').val();
        var pageSize = $('#pagesize').val();
        window.location.href="/recuit/position-offer/position-offer-list.do?pageNum=1&pageSize="+pageSize+"&gwmc="+gwmc;
    }
});