package io.swagger.v3.core.util.reflection.resources;

import java.util.List;

import javax.inject.Inject;

public class Child extends Parent<Integer> implements IParent<Long> {

    protected Child() {

    }

    public Child(String arg) {

    }

    @Override
    public Integer parametrizedMethod1(Integer arg) {
        return null;
    }

    @Override
    public String parametrizedMethod2(Long arg) {
        return null;
    }

    public Integer parametrizedMethod3(Long arg) {
        return null;
    }

    public Integer parametrizedMethod4(Long arg) {
        return null;
    }

    @Override
    public String parametrizedMethod5(Long arg) {
        return null;
    }

    @Override
    public void annotationHolder() {

    }

    @Deprecated
    @Inject
    public void injectableMethod() {

    }

    @IndirectAnnotation
    public void indirectAnnotationMethod() {

    }

    @Override
    public List<Long> parametrizedMethod6(List<Long> arg) {
      return null;
    }
    @Override
    public String simpleMethod(String arg) {
      return null;
    }
    @Override
    public String simpleMethod2(String arg) {
      return null;
    }

}
