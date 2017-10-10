var userTest={
    init:function(){


    },
    userAjax : function(){
        // var dd = JSON.stringify($('#form1').serializeJSON());
        var dd =$('#form1').serialize();
        console.log(dd);
        $.ajax({
            url : "/test/userTest.do",
            type:"get",
            cache:false,
            async:false,
            data:dd,
            dataType:"json",
            success:function(data){
                $("#userDiv").html(data.model.name);
            }
        });
    }
};
$(function(){
    userTest.init();
})
