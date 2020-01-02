/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a Set Object ACL operation. Amazon S3 batch operations passes each value
 * through to the underlying PUT Object acl API. For more information about the parameters for this operation, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html">PUT Object acl</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3SetObjectAclOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectAclOperation implements Serializable, Cloneable {

    /** <p/> */
    private S3AccessControlPolicy accessControlPolicy;

    /**
     * <p/>
     * 
     * @param accessControlPolicy
     */

    public void setAccessControlPolicy(S3AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public S3AccessControlPolicy getAccessControlPolicy() {
        return this.accessControlPolicy;
    }

    /**
     * <p/>
     * 
     * @param accessControlPolicy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectAclOperation withAccessControlPolicy(S3AccessControlPolicy accessControlPolicy) {
        setAccessControlPolicy(accessControlPolicy);
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
        if (getAccessControlPolicy() != null)
            sb.append("AccessControlPolicy: ").append(getAccessControlPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SetObjectAclOperation == false)
            return false;
        S3SetObjectAclOperation other = (S3SetObjectAclOperation) obj;
        if (other.getAccessControlPolicy() == null ^ this.getAccessControlPolicy() == null)
            return false;
        if (other.getAccessControlPolicy() != null && other.getAccessControlPolicy().equals(this.getAccessControlPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlPolicy() == null) ? 0 : getAccessControlPolicy().hashCode());
        return hashCode;
    }

    @Override
    public S3SetObjectAclOperation clone() {
        try {
            return (S3SetObjectAclOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
