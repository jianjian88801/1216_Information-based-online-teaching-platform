const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9qw88/",
            name: "springboot9qw88",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9qw88/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "信息化在线教学平台"
        } 
    }
}
export default base
