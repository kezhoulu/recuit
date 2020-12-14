$(document).ready(function () {
    // 选择框
    $(".select2").select2();

    // WYSIHTML5编辑器
    $(".textarea").wysihtml5({
        locale: 'zh-CN'
    });
});

// 设置激活菜单
function setSidebarActive(tagUri) {
    var liObj = $("#" + tagUri);
    if (liObj.length > 0) {
        liObj.parent().parent().addClass("active");
        liObj.addClass("active");
    }
};

//给select标签赋值
$(function () {
    var status =   $("#statusvalue").val();
    $("#status option").each(function(){
        var value = $(this).attr("value");
        var text = $(this).context.innerHTML;
        if(status!=null && status.indexOf(value) != -1){
            $(this).remove();
            $("#status").append("<option selected value="+value+">"+text+"</option>");
        }
    })
});

$(function(){
    var right = $("#rightvalue").val();
    $("#right option").each(function(){
        var value = $(this).attr("value");
        var text = $(this).context.innerHTML;
        if(right!=null && right.indexOf(value) != -1){
            $(this).remove();
            $("#right").append("<option selected value="+value+">"+text+"</option>");
        }
    })
});