const base = {
    get() {
        return {
            url : "http://localhost:8080/springboott94n4/",
            name: "springboott94n4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboott94n4/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "沁园健身房预约管理系统"
        } 
    }
}
export default base
