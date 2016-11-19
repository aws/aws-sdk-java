/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A key/value pair containing user-defined metadata that you can associate with an Amazon EMR resource. Tags make it
 * easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation
 * costs. For more information, see <a
 * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
 * Resources</a>.
 * </p>
 */
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     */
    private String value;

    /**
     * Default constructor for Tag object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Tag() {
    }

    /**
     * Constructs a new Tag object. Callers should use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param key
     *        A user-defined key, which is the minimum required information for a valid tag. For more information, see
     *        <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging
     *        Amazon EMR Resources</a>.
     * @param value
     *        A user-defined value, which is optional in a tag. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon
     *        EMR Resources</a>.
     */
    public Tag(String key, String value) {
        setKey(key);
        setValue(value);
    }

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param key
     *        A user-defined key, which is the minimum required information for a valid tag. For more information, see
     *        <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging
     *        Amazon EMR Resources</a>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @return A user-defined key, which is the minimum required information for a valid tag. For more information, see
     *         <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging
     *         Amazon EMR Resources</a>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param key
     *        A user-defined key, which is the minimum required information for a valid tag. For more information, see
     *        <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging
     *        Amazon EMR Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param value
     *        A user-defined value, which is optional in a tag. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon
     *        EMR Resources</a>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @return A user-defined value, which is optional in a tag. For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging
     *         Amazon EMR Resources</a>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param value
     *        A user-defined value, which is optional in a tag. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon
     *        EMR Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
