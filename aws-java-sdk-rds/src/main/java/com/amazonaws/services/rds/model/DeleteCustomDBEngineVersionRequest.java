/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteCustomDBEngineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomDBEngineVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The database engine. RDS Custom for Oracle supports the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2-cdb</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional for
     * Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per
     * Amazon Web Services Region.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The database engine. RDS Custom for Oracle supports the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2-cdb</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine. RDS Custom for Oracle supports the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-se2-cdb</code>
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine. RDS Custom for Oracle supports the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2-cdb</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The database engine. RDS Custom for Oracle supports the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>custom-oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-oracle-ee-cdb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-oracle-se2-cdb</code>
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine. RDS Custom for Oracle supports the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-se2-cdb</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine. RDS Custom for Oracle supports the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-se2-cdb</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomDBEngineVersionRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional for
     * Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per
     * Amazon Web Services Region.
     * </p>
     * 
     * @param engineVersion
     *        The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional
     *        for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     *        customer per Amazon Web Services Region.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional for
     * Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per
     * Amazon Web Services Region.
     * </p>
     * 
     * @return The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but
     *         optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique
     *         per customer per Amazon Web Services Region.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional for
     * Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per customer per
     * Amazon Web Services Region.
     * </p>
     * 
     * @param engineVersion
     *        The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional
     *        for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     *        customer per Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomDBEngineVersionRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomDBEngineVersionRequest == false)
            return false;
        DeleteCustomDBEngineVersionRequest other = (DeleteCustomDBEngineVersionRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomDBEngineVersionRequest clone() {
        return (DeleteCustomDBEngineVersionRequest) super.clone();
    }

}
