
function mydate() {
    $.get('/user/getAjaxUser',function (json) {
        if(json.flag){
            var v=1;
            var arr=json.obj;
            var str=''
            for(var i=0;i<arr.length;i++){

                str+='<tr><td>'+ arr[i].id +'</td>\
                  <td>'+arr[i].name+'</td>\
                  <td>'+arr[i].telNum+'</td>\
                        <td>'
                    +'<a href="javascript:void (0)" class="newsBtntwo" onclick="stoprwo(' + arr[i].jobId + ')">编辑</a>\
                         <a href="javascript:void (0)" onclick="deleteList(' + arr[i].jobId + ')">删除</a>\
                         <a href="javascript:void (0)" onclick="deleteList(' + arr[i].jobId + ')">添加</a>\
                    </td></tr>'
            }
            $('table tbody').html(str)
        }
    })

}
$(function () {

    mydate();
})