package edu.washington.cs.knowitall.commonlib.regex;

import com.google.common.base.Predicate;

public interface Expression<E> extends Predicate<E> {
    
    public static class Star<E> implements Expression<E> {
        Expression<E> expr;
        
        public Star(Expression<E> expr) {
            this.expr = expr;
        }

        @Override
        public boolean apply(E entity) {
            return this.expr.apply(entity);
        }
    }
    
    public static class Plus<E> implements Expression<E> {
        Expression<E> expr;
        
        public Plus(Expression<E> expr) {
            this.expr = expr;
        }

        @Override
        public boolean apply(E entity) {
            return this.expr.apply(entity);
        }
    }
    
    public static class Option<E> implements Expression<E> {
        Expression<E> expr;
        
        public Option(Expression<E> expr) {
            this.expr = expr;
        }

        @Override
        public boolean apply(E entity) {
            return this.expr.apply(entity);
        }
    }
    
    static abstract class BaseExpression<E> implements Expression<E> {
        private final String source;
        
        public BaseExpression(String source) {
            this.source = source;
        }

        public abstract boolean apply(E arg0);
        
        public String toString() {
            return this.source;
        }
    }
}
