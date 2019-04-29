package bean;

public class Collect {
    private Integer collectid;

    private Long foodsid;

    private String foodsname;

    private String image;

    private Long userid;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Long getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Long foodsid) {
        this.foodsid = foodsid;
    }

    public String getFoodsname() {
        return foodsname;
    }

    public void setFoodsname(String foodsname) {
        this.foodsname = foodsname == null ? null : foodsname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}