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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterRdsDbInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterRdsDbInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     */
    private String rdsDbInstanceArn;
    /**
     * <p>
     * The database's master user name.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The database password.
     * </p>
     */
    private String dbPassword;

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterRdsDbInstanceRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The Amazon RDS instance's ARN.
     */

    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @return The Amazon RDS instance's ARN.
     */

    public String getRdsDbInstanceArn() {
        return this.rdsDbInstanceArn;
    }

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The Amazon RDS instance's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterRdsDbInstanceRequest withRdsDbInstanceArn(String rdsDbInstanceArn) {
        setRdsDbInstanceArn(rdsDbInstanceArn);
        return this;
    }

    /**
     * <p>
     * The database's master user name.
     * </p>
     * 
     * @param dbUser
     *        The database's master user name.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database's master user name.
     * </p>
     * 
     * @return The database's master user name.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database's master user name.
     * </p>
     * 
     * @param dbUser
     *        The database's master user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterRdsDbInstanceRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @param dbPassword
     *        The database password.
     */

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @return The database password.
     */

    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @param dbPassword
     *        The database password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterRdsDbInstanceRequest withDbPassword(String dbPassword) {
        setDbPassword(dbPassword);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getRdsDbInstanceArn() != null)
            sb.append("RdsDbInstanceArn: ").append(getRdsDbInstanceArn()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getDbPassword() != null)
            sb.append("DbPassword: ").append(getDbPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterRdsDbInstanceRequest == false)
            return false;
        RegisterRdsDbInstanceRequest other = (RegisterRdsDbInstanceRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null)
            return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbPassword() == null ^ this.getDbPassword() == null)
            return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode());
        return hashCode;
    }

    @Override
    public RegisterRdsDbInstanceRequest clone() {
        return (RegisterRdsDbInstanceRequest) super.clone();
    }

}
