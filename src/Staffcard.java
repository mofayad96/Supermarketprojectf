protected String id;
    protected String username;
    protected String code_to_open;


    public Staffcard( String id, String username, String code_to_open) {
        this.id = id;
        this.username = username;
        this.code_to_open = code_to_open;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCode_to_open(String code_to_open) {
        this.code_to_open = code_to_open;
    }

    public String getCode_to_open() {
        System.out.println("Your code is : "+ code_to_open);
        return code_to_open;
    }

}
