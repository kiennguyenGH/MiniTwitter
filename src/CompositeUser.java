public interface CompositeUser {
    public String getID();
    public void addUser(CompositeUser user);
    public boolean isComposite();
}
