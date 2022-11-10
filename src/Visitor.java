public interface Visitor {
    public void visitUser(CompositeUser user);
    public void visitGroup(CompositeUser userGroup);
}
