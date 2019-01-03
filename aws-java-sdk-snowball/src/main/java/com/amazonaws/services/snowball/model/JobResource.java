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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an array of AWS resource objects. Each object represents an Amazon S3 bucket, an AWS Lambda function, or an
 * Amazon Machine Image (AMI) based on Amazon EC2 that is associated with a particular job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/JobResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobResource implements Serializable, Cloneable, StructuredPojo {

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
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     */
    private java.util.List<Ec2AmiResource> ec2AmiResources;

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
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * 
     * @return The Amazon Machine Images (AMIs) associated with this job.
     */

    public java.util.List<Ec2AmiResource> getEc2AmiResources() {
        return ec2AmiResources;
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * 
     * @param ec2AmiResources
     *        The Amazon Machine Images (AMIs) associated with this job.
     */

    public void setEc2AmiResources(java.util.Collection<Ec2AmiResource> ec2AmiResources) {
        if (ec2AmiResources == null) {
            this.ec2AmiResources = null;
            return;
        }

        this.ec2AmiResources = new java.util.ArrayList<Ec2AmiResource>(ec2AmiResources);
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2AmiResources(java.util.Collection)} or {@link #withEc2AmiResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2AmiResources
     *        The Amazon Machine Images (AMIs) associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withEc2AmiResources(Ec2AmiResource... ec2AmiResources) {
        if (this.ec2AmiResources == null) {
            setEc2AmiResources(new java.util.ArrayList<Ec2AmiResource>(ec2AmiResources.length));
        }
        for (Ec2AmiResource ele : ec2AmiResources) {
            this.ec2AmiResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * 
     * @param ec2AmiResources
     *        The Amazon Machine Images (AMIs) associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobResource withEc2AmiResources(java.util.Collection<Ec2AmiResource> ec2AmiResources) {
        setEc2AmiResources(ec2AmiResources);
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
        if (getS3Resources() != null)
            sb.append("S3Resources: ").append(getS3Resources()).append(",");
        if (getLambdaResources() != null)
            sb.append("LambdaResources: ").append(getLambdaResources()).append(",");
        if (getEc2AmiResources() != null)
            sb.append("Ec2AmiResources: ").append(getEc2AmiResources());
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
        if (other.getEc2AmiResources() == null ^ this.getEc2AmiResources() == null)
            return false;
        if (other.getEc2AmiResources() != null && other.getEc2AmiResources().equals(this.getEc2AmiResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        hashCode = prime * hashCode + ((getLambdaResources() == null) ? 0 : getLambdaResources().hashCode());
        hashCode = prime * hashCode + ((getEc2AmiResources() == null) ? 0 : getEc2AmiResources().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.JobResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
