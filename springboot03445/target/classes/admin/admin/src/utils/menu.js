const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "员工",
                    "menuJump": "列表",
                    "tableName": "yuangong"
                }], "menu": "员工管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "导出"],
                    "menu": "客户信息",
                    "menuJump": "列表",
                    "tableName": "kehuxinxi"
                }], "menu": "客户信息管理"
            },
            //     {
            //     "child": [{
            //         "buttons": ["新增", "查看", "修改", "删除"],
            //         "menu": "行业类型",
            //         "menuJump": "列表",
            //         "tableName": "xingyeleixing"
            //     }], "menu": "行业类型管理"
            // },
                {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "收益", "导出", "收益分配"],
                    "menu": "项目信息",
                    "menuJump": "列表",
                    "tableName": "xiangmuxinxi"
                }], "menu": "项目信息管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "项目类型",
                    "menuJump": "列表",
                    "tableName": "xiangmuleixing"
                }], "menu": "项目类型管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "报表", "导出"],
                    "menu": "项目收益",
                    "menuJump": "列表",
                    "tableName": "xiangmushouyi"
                }], "menu": "项目收益管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["查看", "修改", "删除", "新增"],
                    "menu": "客户信息",
                    "menuJump": "列表",
                    "tableName": "kehuxinxi"
                }], "menu": "客户信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "新增"],
                    "menu": "项目信息",
                    "menuJump": "列表",
                    "tableName": "xiangmuxinxi"
                }], "menu": "项目信息管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "项目收益", "menuJump": "列表", "tableName": "xiangmushouyi"}],
                "menu": "项目收益管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "员工",
            "tableName": "yuangong"
        }]
    }
}
export default menu;
