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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     */
    private java.util.List<Backup> backups;
    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * 
     * @return Contains the response to a <code>DescribeBackups</code> request.
     */

    public java.util.List<Backup> getBackups() {
        return backups;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * 
     * @param backups
     *        Contains the response to a <code>DescribeBackups</code> request.
     */

    public void setBackups(java.util.Collection<Backup> backups) {
        if (backups == null) {
            this.backups = null;
            return;
        }

        this.backups = new java.util.ArrayList<Backup>(backups);
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackups(java.util.Collection)} or {@link #withBackups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param backups
     *        Contains the response to a <code>DescribeBackups</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsResult withBackups(Backup... backups) {
        if (this.backups == null) {
            setBackups(new java.util.ArrayList<Backup>(backups.length));
        }
        for (Backup ele : backups) {
            this.backups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeBackups</code> request.
     * </p>
     * 
     * @param backups
     *        Contains the response to a <code>DescribeBackups</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsResult withBackups(java.util.Collection<Backup> backups) {
        setBackups(backups);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @return This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBackups() != null)
            sb.append("Backups: ").append(getBackups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupsResult == false)
            return false;
        DescribeBackupsResult other = (DescribeBackupsResult) obj;
        if (other.getBackups() == null ^ this.getBackups() == null)
            return false;
        if (other.getBackups() != null && other.getBackups().equals(this.getBackups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackups() == null) ? 0 : getBackups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupsResult clone() {
        try {
            return (DescribeBackupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
