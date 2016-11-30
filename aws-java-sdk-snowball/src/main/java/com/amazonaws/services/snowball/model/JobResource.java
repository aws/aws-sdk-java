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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3
 * bucket that your transferred data will be exported from or imported into.
 * </p>
 */
public class JobResource implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     */
    private java.util.List<S3Resource> s3Resources;
    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     */
    private java.util.List<LambdaResource> lambdaResources;

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * 
     * @return An array of <code>S3Resource</code> objects.
     */

    public java.util.List<S3Resource> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * 
     * @param s3Resources
     *        An array of <code>S3Resource</code> objects.
     */

    public void setS3Resources(java.util.Collection<S3Resource> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3Resource>(s3Resources);
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Resources(java.util.Collection)} or {@link #withS3Resources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Resources
     *        An array of <code>S3Resource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withS3Resources(S3Resource... s3Resources) {
        if (this.s3Resources == null) {
            setS3Resources(new java.util.ArrayList<S3Resource>(s3Resources.length));
        }
        for (S3Resource ele : s3Resources) {
            this.s3Resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * 
     * @param s3Resources
     *        An array of <code>S3Resource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withS3Resources(java.util.Collection<S3Resource> s3Resources) {
        setS3Resources(s3Resources);
        return this;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * 
     * @return The Python-language Lambda functions for this job.
     */

    public java.util.List<LambdaResource> getLambdaResources() {
        return lambdaResources;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * 
     * @param lambdaResources
     *        The Python-language Lambda functions for this job.
     */

    public void setLambdaResources(java.util.Collection<LambdaResource> lambdaResources) {
        if (lambdaResources == null) {
            this.lambdaResources = null;
            return;
        }

        this.lambdaResources = new java.util.ArrayList<LambdaResource>(lambdaResources);
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaResources(java.util.Collection)} or {@link #withLambdaResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lambdaResources
     *        The Python-language Lambda functions for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withLambdaResources(LambdaResource... lambdaResources) {
        if (this.lambdaResources == null) {
            setLambdaResources(new java.util.ArrayList<LambdaResource>(lambdaResources.length));
        }
        for (LambdaResource ele : lambdaResources) {
            this.lambdaResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * 
     * @param lambdaResources
     *        The Python-language Lambda functions for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withLambdaResources(java.util.Collection<LambdaResource> lambdaResources) {
        setLambdaResources(lambdaResources);
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
        if (getS3Resources() != null)
            sb.append("S3Resources: " + getS3Resources() + ",");
        if (getLambdaResources() != null)
            sb.append("LambdaResources: " + getLambdaResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobResource == false)
            return false;
        JobResource other = (JobResource) obj;
        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        if (other.getLambdaResources() == null ^ this.getLambdaResources() == null)
            return false;
        if (other.getLambdaResources() != null && other.getLambdaResources().equals(this.getLambdaResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        hashCode = prime * hashCode + ((getLambdaResources() == null) ? 0 : getLambdaResources().hashCode());
        return hashCode;
    }

    @Override
    public JobResource clone() {
        try {
            return (JobResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
