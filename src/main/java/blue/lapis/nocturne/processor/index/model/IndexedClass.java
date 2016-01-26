package blue.lapis.nocturne.processor.index.model;

import blue.lapis.nocturne.processor.constantpool.model.ConstantPool;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * A summary of select info from a processed class file.
 */
public class IndexedClass {

    private final String name;
    private final ConstantPool constantPool;
    private final String superClass;
    private final ImmutableList<String> interfaces;
    private final ImmutableList<MethodSignature> methods;

    public IndexedClass(String name, ConstantPool constantPool, String superClass, List<String> interfaces,
            List<MethodSignature> methods) {
        this.name = name;
        this.constantPool = constantPool;
        this.superClass = superClass;
        this.interfaces = ImmutableList.copyOf(interfaces);
        this.methods = ImmutableList.copyOf(methods);
    }

    public String getName() {
        return name;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public String getSuperclass() {
        return superClass;
    }

    public ImmutableList<String> getInterfaces() {
        return interfaces;
    }

    public ImmutableList<MethodSignature> getMethods() {
        return methods;
    }

}
