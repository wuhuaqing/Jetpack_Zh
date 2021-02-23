package com.example.myapplication.bean.resp;

import java.util.List;

/**
 * description ： TODO:类的作用
 * author : 姓名
 * date : 2020/9/22 11:40
 */
public class Resp {

    /**
     * date : 20200922
     * stories : [{"image_hue":"0x49499b","title":"人类可以凭空想象出并不存在的颜色吗？","url":"https://daily.zhihu.com/story/9728160","hint":"卜仆 · 2 分钟阅读","ga_prefix":"092207","images":["https://picb.zhimg.com/v2-4497d2a4e1141226c0e52abb40ea2e1c.jpg?source=8673f162"],"type":0,"id":9728160},{"image_hue":"0xb38c46","title":"非洲野生的长颈鹿会被闪电劈中吗？","url":"https://daily.zhihu.com/story/9728172","hint":"苏澄宇 · 2 分钟阅读","ga_prefix":"092207","images":["https://pic1.zhimg.com/v2-8dca7514b147e9a8c244373d58c82f3b.jpg?source=8673f162"],"type":0,"id":9728172},{"image_hue":"0xb38f56","title":"如何通过考古学研究酒的发明时间？","url":"https://daily.zhihu.com/story/9728163","hint":"知乎用户 · 3 分钟阅读","ga_prefix":"092207","images":["https://pic1.zhimg.com/v2-855d0ae468483af1bfd5df8316711d46.jpg?source=8673f162"],"type":0,"id":9728163},{"image_hue":"0x3f5239","title":"有哪些自己难以意识到，但却不尊重别人的行为？","url":"https://daily.zhihu.com/story/9728178","hint":"巴赫爱喝胡辣汤 · 5 分钟阅读","ga_prefix":"092207","images":["https://pic3.zhimg.com/v2-f72179480739df70e804beebde8290f2.jpg?source=8673f162"],"type":0,"id":9728178},{"image_hue":"0x291d1f","title":"如何评价魔术师约翰逊？","url":"https://daily.zhihu.com/story/9728152","hint":"黎声旭 · 22 分钟阅读","ga_prefix":"092207","images":["https://pic2.zhimg.com/v2-b0b682c564ceca76f6dc9309e121fc78.jpg?source=8673f162"],"type":0,"id":9728152},{"image_hue":"0x404b17","title":"瞎扯 · 如何正确地吐槽","url":"https://daily.zhihu.com/story/9728151","hint":"VOL.2489","ga_prefix":"092206","images":["https://pic2.zhimg.com/v2-fba8c10504e430c55d14dc9931c4b77b.jpg?source=8673f162"],"type":0,"id":9728151}]
     * top_stories : [{"image_hue":"0x7d92b3","hint":"作者 / 星球研究所","url":"https://daily.zhihu.com/story/9728077","image":"https://picb.zhimg.com/v2-783c45219fc1373f8c83fecec51bae1f.jpg?source=8673f162","title":"故宫是一座怎样的宫殿？","ga_prefix":"091907","type":0,"id":9728077},{"image_hue":"0xb36c25","hint":"作者 / 唐葫芦","url":"https://daily.zhihu.com/story/9728033","image":"https://pic1.zhimg.com/v2-f10fe2e1e82ddfadcbc1354980b263e0.jpg?source=8673f162","title":"有关大闸蟹的 50 条冷知识","ga_prefix":"091807","type":0,"id":9728033},{"image_hue":"0x131313","hint":"作者 / Kushim Jiang","url":"https://daily.zhihu.com/story/9727936","image":"https://pic2.zhimg.com/v2-c11dd56c22edf919610a39c3e0c08e11.jpg?source=8673f162","title":"为什么有些汉字明明存在，却无法用输入法打出来？","ga_prefix":"091607","type":0,"id":9727936},{"image_hue":"0x3b3045","hint":"作者 / 蒋小坏","url":"https://daily.zhihu.com/story/9727895","image":"https://pic2.zhimg.com/v2-294569192786b10cdd7949cd3fbf6082.jpg?source=8673f162","title":"齿轮只断了一个齿能否转动？","ga_prefix":"091507","type":0,"id":9727895},{"image_hue":"0xb37d81","hint":"作者 / Sean Ye","url":"https://daily.zhihu.com/story/9727824","image":"https://pic1.zhimg.com/v2-4020dddbe97abe5b2ad2fcecb4407153.jpg?source=8673f162","title":"面试时应该如何谈薪酬？","ga_prefix":"091407","type":0,"id":9727824}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * image_hue : 0x49499b
         * title : 人类可以凭空想象出并不存在的颜色吗？
         * url : https://daily.zhihu.com/story/9728160
         * hint : 卜仆 · 2 分钟阅读
         * ga_prefix : 092207
         * images : ["https://picb.zhimg.com/v2-4497d2a4e1141226c0e52abb40ea2e1c.jpg?source=8673f162"]
         * type : 0
         * id : 9728160
         */

        private String image_hue;
        private String title;
        private String url;
        private String hint;
        private String ga_prefix;
        private int type;
        private int id;
        private List<String> images;

        public String getImage_hue() {
            return image_hue;
        }

        public void setImage_hue(String image_hue) {
            this.image_hue = image_hue;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHint() {
            return hint;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image_hue : 0x7d92b3
         * hint : 作者 / 星球研究所
         * url : https://daily.zhihu.com/story/9728077
         * image : https://picb.zhimg.com/v2-783c45219fc1373f8c83fecec51bae1f.jpg?source=8673f162
         * title : 故宫是一座怎样的宫殿？
         * ga_prefix : 091907
         * type : 0
         * id : 9728077
         */

        private String image_hue;
        private String hint;
        private String url;
        private String image;
        private String title;
        private String ga_prefix;
        private int type;
        private int id;

        public String getImage_hue() {
            return image_hue;
        }

        public void setImage_hue(String image_hue) {
            this.image_hue = image_hue;
        }

        public String getHint() {
            return hint;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
