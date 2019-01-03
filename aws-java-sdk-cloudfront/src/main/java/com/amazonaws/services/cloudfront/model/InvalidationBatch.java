/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An invalidation batch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/InvalidationBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidationBatch implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the objects that you want to invalidate. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     * >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Paths paths;
    /**
     * <p>
     * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you
     * from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must
     * specify a new value for <code>CallerReference</code> and change other values in the request as applicable. One
     * way to ensure that the value of <code>CallerReference</code> is unique is to use a <code>timestamp</code>, for
     * example, <code>20120301090000</code>.
     * </p>
     * <p>
     * If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the rest
     * of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns
     * information about the invalidation request that you previously created with the same <code>CallerReference</code>
     * .
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but the
     * content of any <code>Path</code> is different from the original request, CloudFront returns an
     * <code>InvalidationBatchAlreadyExists</code> error.
     * </p>
     */
    private String callerReference;

    /**
     * Default constructor for InvalidationBatch object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public InvalidationBatch() {
    }

    /**
     * Constructs a new InvalidationBatch object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param paths
     *        A complex type that contains information about the objects that you want to invalidate. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     *        >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @param callerReference
     *        A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to
     *        prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation
     *        request, you must specify a new value for <code>CallerReference</code> and change other values in the
     *        request as applicable. One way to ensure that the value of <code>CallerReference</code> is unique is to
     *        use a <code>timestamp</code>, for example, <code>20120301090000</code>.</p>
     *        <p>
     *        If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the
     *        rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront
     *        returns information about the invalidation request that you previously created with the same
     *        <code>CallerReference</code>.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but
     *        the content of any <code>Path</code> is different from the original request, CloudFront returns an
     *        <code>InvalidationBatchAlreadyExists</code> error.
     */
    public InvalidationBatch(Paths paths, String callerReference) {
        setPaths(paths);
        setCallerReference(callerReference);
    }

    /**
     * Constructs a new InvalidationBatch object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param callerReference
     *        A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to
     *        prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation
     *        request, you must specify a new value for <code>CallerReference</code> and change other values in the
     *        request as applicable. One way to ensure that the value of <code>CallerReference</code> is unique is to
     *        use a <code>timestamp</code>, for example, <code>20120301090000</code>.</p>
     *        <p>
     *        If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the
     *        rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront
     *        returns information about the invalidation request that you previously created with the same
     *        <code>CallerReference</code>.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but
     *        the content of any <code>Path</code> is different from the original request, CloudFront returns an
     *        <code>InvalidationBatchAlreadyExists</code> error.
     */
    public InvalidationBatch(String callerReference) {
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * A complex type that contains information about the objects that you want to invalidate. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     * >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param paths
     *        A complex type that contains information about the objects that you want to invalidate. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     *        >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    /**
     * <p>
     * A complex type that contains information about the objects that you want to invalidate. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     * >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A complex type that contains information about the objects that you want to invalidate. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     *         >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Paths getPaths() {
        return this.paths;
    }

    /**
     * <p>
     * A complex type that contains information about the objects that you want to invalidate. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     * >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param paths
     *        A complex type that contains information about the objects that you want to invalidate. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects"
     *        >Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationBatch withPaths(Paths paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you
     * from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must
     * specify a new value for <code>CallerReference</code> and change other values in the request as applicable. One
     * way to ensure that the value of <code>CallerReference</code> is unique is to use a <code>timestamp</code>, for
     * example, <code>20120301090000</code>.
     * </p>
     * <p>
     * If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the rest
     * of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns
     * information about the invalidation request that you previously created with the same <code>CallerReference</code>
     * .
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but the
     * content of any <code>Path</code> is different from the original request, CloudFront returns an
     * <code>InvalidationBatchAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to
     *        prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation
     *        request, you must specify a new value for <code>CallerReference</code> and change other values in the
     *        request as applicable. One way to ensure that the value of <code>CallerReference</code> is unique is to
     *        use a <code>timestamp</code>, for example, <code>20120301090000</code>.</p>
     *        <p>
     *        If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the
     *        rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront
     *        returns information about the invalidation request that you previously created with the same
     *        <code>CallerReference</code>.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but
     *        the content of any <code>Path</code> is different from the original request, CloudFront returns an
     *        <code>InvalidationBatchAlreadyExists</code> error.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you
     * from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must
     * specify a new value for <code>CallerReference</code> and change other values in the request as applicable. One
     * way to ensure that the value of <code>CallerReference</code> is unique is to use a <code>timestamp</code>, for
     * example, <code>20120301090000</code>.
     * </p>
     * <p>
     * If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the rest
     * of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns
     * information about the invalidation request that you previously created with the same <code>CallerReference</code>
     * .
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but the
     * content of any <code>Path</code> is different from the original request, CloudFront returns an
     * <code>InvalidationBatchAlreadyExists</code> error.
     * </p>
     * 
     * @return A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to
     *         prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation
     *         request, you must specify a new value for <code>CallerReference</code> and change other values in the
     *         request as applicable. One way to ensure that the value of <code>CallerReference</code> is unique is to
     *         use a <code>timestamp</code>, for example, <code>20120301090000</code>.</p>
     *         <p>
     *         If you make a second invalidation request with the same value for <code>CallerReference</code>, and if
     *         the rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead,
     *         CloudFront returns information about the invalidation request that you previously created with the same
     *         <code>CallerReference</code>.
     *         </p>
     *         <p>
     *         If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but
     *         the content of any <code>Path</code> is different from the original request, CloudFront returns an
     *         <code>InvalidationBatchAlreadyExists</code> error.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you
     * from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must
     * specify a new value for <code>CallerReference</code> and change other values in the request as applicable. One
     * way to ensure that the value of <code>CallerReference</code> is unique is to use a <code>timestamp</code>, for
     * example, <code>20120301090000</code>.
     * </p>
     * <p>
     * If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the rest
     * of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns
     * information about the invalidation request that you previously created with the same <code>CallerReference</code>
     * .
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but the
     * content of any <code>Path</code> is different from the original request, CloudFront returns an
     * <code>InvalidationBatchAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to
     *        prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation
     *        request, you must specify a new value for <code>CallerReference</code> and change other values in the
     *        request as applicable. One way to ensure that the value of <code>CallerReference</code> is unique is to
     *        use a <code>timestamp</code>, for example, <code>20120301090000</code>.</p>
     *        <p>
     *        If you make a second invalidation request with the same value for <code>CallerReference</code>, and if the
     *        rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront
     *        returns information about the invalidation request that you previously created with the same
     *        <code>CallerReference</code>.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value you already sent in a previous invalidation batch request but
     *        the content of any <code>Path</code> is different from the original request, CloudFront returns an
     *        <code>InvalidationBatchAlreadyExists</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationBatch withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidationBatch == false)
            return false;
        InvalidationBatch other = (InvalidationBatch) obj;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        return hashCode;
    }

    @Override
    public InvalidationBatch clone() {
        try {
            return (InvalidationBatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
