/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database to get temporary authorization to log on to.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     * hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     * Redshift Database Developer Guide
     * </p>
     * </li>
     * </ul>
     */
    private String dbName;
    /**
     * <p>
     * The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum
     * is 3600 seconds.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The name of the database to get temporary authorization to log on to.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     * hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     * Redshift Database Developer Guide
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbName
     *        The name of the database to get temporary authorization to log on to.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol
     *        (@), or hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     *        Redshift Database Developer Guide
     *        </p>
     *        </li>
     */

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * <p>
     * The name of the database to get temporary authorization to log on to.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     * hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     * Redshift Database Developer Guide
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the database to get temporary authorization to log on to.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol
     *         (@), or hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found in <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the
     *         Amazon Redshift Database Developer Guide
     *         </p>
     *         </li>
     */

    public String getDbName() {
        return this.dbName;
    }

    /**
     * <p>
     * The name of the database to get temporary authorization to log on to.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     * hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     * Redshift Database Developer Guide
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbName
     *        The name of the database to get temporary authorization to log on to.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only uppercase or lowercase letters, numbers, underscore, plus sign, period (dot), at symbol
     *        (@), or hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words </a> in the Amazon
     *        Redshift Database Developer Guide
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsRequest withDbName(String dbName) {
        setDbName(dbName);
        return this;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum
     * is 3600 seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the
     *        maximum is 3600 seconds.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum
     * is 3600 seconds.
     * </p>
     * 
     * @return The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the
     *         maximum is 3600 seconds.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum
     * is 3600 seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the
     *        maximum is 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @return The name of the workgroup associated with the database.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getDbName() != null)
            sb.append("DbName: ").append(getDbName()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCredentialsRequest == false)
            return false;
        GetCredentialsRequest other = (GetCredentialsRequest) obj;
        if (other.getDbName() == null ^ this.getDbName() == null)
            return false;
        if (other.getDbName() != null && other.getDbName().equals(this.getDbName()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbName() == null) ? 0 : getDbName().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public GetCredentialsRequest clone() {
        return (GetCredentialsRequest) super.clone();
    }

}
