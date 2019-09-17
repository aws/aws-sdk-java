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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result message containing a list of application descriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ApplicationDescription> applications;

    /**
     * <p>
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * </p>
     * 
     * @return This parameter contains a list of <a>ApplicationDescription</a>.
     */

    public java.util.List<ApplicationDescription> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<ApplicationDescription>();
        }
        return applications;
    }

    /**
     * <p>
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * </p>
     * 
     * @param applications
     *        This parameter contains a list of <a>ApplicationDescription</a>.
     */

    public void setApplications(java.util.Collection<ApplicationDescription> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<ApplicationDescription>(applications);
    }

    /**
     * <p>
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        This parameter contains a list of <a>ApplicationDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsResult withApplications(ApplicationDescription... applications) {
        if (this.applications == null) {
            setApplications(new com.amazonaws.internal.SdkInternalList<ApplicationDescription>(applications.length));
        }
        for (ApplicationDescription ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * </p>
     * 
     * @param applications
     *        This parameter contains a list of <a>ApplicationDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsResult withApplications(java.util.Collection<ApplicationDescription> applications) {
        setApplications(applications);
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
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationsResult == false)
            return false;
        DescribeApplicationsResult other = (DescribeApplicationsResult) obj;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationsResult clone() {
        try {
            return (DescribeApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
