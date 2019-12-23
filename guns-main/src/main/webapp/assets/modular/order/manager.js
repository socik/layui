layui.use(['layer', 'form', 'table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var layer = layui.layer;
    var form = layui.form;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 系统管理--角色管理
     */
    var Role = {
        tableId: "orderTable",    //表格id
        condition: {
            poItemId: ""
        }
    };

    /**
     * 初始化表格的列
     */
    Role.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'poItemId', hide: true, sort: true, title: '行项目ID'},
            {field: 'itemNo', align: "center", sort: true, title: '行项目号'},
            {field: 'projectCategory', align: "center", sort: true, title: '项目类别'},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]];
    };

    /**
     * 点击查询按钮
     */
    Role.search = function () {
        var queryData = {};
        queryData['poItemId'] = $("#poItemId").val();
        table.reload(Role.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + Role.tableId,
        url: Feng.ctxPath + '/order/list',
        page: true,
        height: "full-98",
        cellMinWidth: 100,
        cols: Role.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        Role.search();
    });

});
