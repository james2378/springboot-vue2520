const base = {
    get() {
        return {
            url : "http://localhost:8080/wenxuezuopin/",
            name: "wenxuezuopin",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wenxuezuopin/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "文学作品网站"
        } 
    }
}
export default base
