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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ImportInstallationMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstallationMediaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the custom Availability Zone (AZ) to import the installation media to.
     * </p>
     */
    private String customAvailabilityZoneId;
    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * The list only includes supported DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions. The list only
     * includes DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The path to the installation medium for the specified DB engine.
     * </p>
     * <p>
     * Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     * </p>
     */
    private String engineInstallationMediaPath;
    /**
     * <p>
     * The path to the installation medium for the operating system associated with the specified DB engine.
     * </p>
     * <p>
     * Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     * </p>
     */
    private String oSInstallationMediaPath;

    /**
     * <p>
     * The identifier of the custom Availability Zone (AZ) to import the installation media to.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The identifier of the custom Availability Zone (AZ) to import the installation media to.
     */

    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom Availability Zone (AZ) to import the installation media to.
     * </p>
     * 
     * @return The identifier of the custom Availability Zone (AZ) to import the installation media to.
     */

    public String getCustomAvailabilityZoneId() {
        return this.customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom Availability Zone (AZ) to import the installation media to.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The identifier of the custom Availability Zone (AZ) to import the installation media to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaRequest withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        setCustomAvailabilityZoneId(customAvailabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * The list only includes supported DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance. </p>
     *        <p>
     *        The list only includes supported DB engines that require an on-premises customer provided license.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * The list only includes supported DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the database engine to be used for this instance. </p>
     *         <p>
     *         The list only includes supported DB engines that require an on-premises customer provided license.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * The list only includes supported DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance. </p>
     *        <p>
     *        The list only includes supported DB engines that require an on-premises customer provided license.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions. The list only
     * includes DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     *        </p>
     *        <p>
     *        The following are the database engines and links to information about the major and minor versions. The
     *        list only includes DB engines that require an on-premises customer provided license.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        See <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *        >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions. The list only
     * includes DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     *         </p>
     *         <p>
     *         The following are the database engines and links to information about the major and minor versions. The
     *         list only includes DB engines that require an on-premises customer provided license.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *         >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions. The list only
     * includes DB engines that require an on-premises customer provided license.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        For a list of valid engine versions, call <a>DescribeDBEngineVersions</a>.
     *        </p>
     *        <p>
     *        The following are the database engines and links to information about the major and minor versions. The
     *        list only includes DB engines that require an on-premises customer provided license.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        See <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *        >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the specified DB engine.
     * </p>
     * <p>
     * Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     * </p>
     * 
     * @param engineInstallationMediaPath
     *        The path to the installation medium for the specified DB engine.</p>
     *        <p>
     *        Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     */

    public void setEngineInstallationMediaPath(String engineInstallationMediaPath) {
        this.engineInstallationMediaPath = engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the specified DB engine.
     * </p>
     * <p>
     * Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     * </p>
     * 
     * @return The path to the installation medium for the specified DB engine.</p>
     *         <p>
     *         Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     */

    public String getEngineInstallationMediaPath() {
        return this.engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the specified DB engine.
     * </p>
     * <p>
     * Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     * </p>
     * 
     * @param engineInstallationMediaPath
     *        The path to the installation medium for the specified DB engine.</p>
     *        <p>
     *        Example: <code>SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaRequest withEngineInstallationMediaPath(String engineInstallationMediaPath) {
        setEngineInstallationMediaPath(engineInstallationMediaPath);
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the specified DB engine.
     * </p>
     * <p>
     * Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     * </p>
     * 
     * @param oSInstallationMediaPath
     *        The path to the installation medium for the operating system associated with the specified DB engine.</p>
     *        <p>
     *        Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     */

    public void setOSInstallationMediaPath(String oSInstallationMediaPath) {
        this.oSInstallationMediaPath = oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the specified DB engine.
     * </p>
     * <p>
     * Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     * </p>
     * 
     * @return The path to the installation medium for the operating system associated with the specified DB engine.</p>
     *         <p>
     *         Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     */

    public String getOSInstallationMediaPath() {
        return this.oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the specified DB engine.
     * </p>
     * <p>
     * Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     * </p>
     * 
     * @param oSInstallationMediaPath
     *        The path to the installation medium for the operating system associated with the specified DB engine.</p>
     *        <p>
     *        Example: <code>WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaRequest withOSInstallationMediaPath(String oSInstallationMediaPath) {
        setOSInstallationMediaPath(oSInstallationMediaPath);
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
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: ").append(getCustomAvailabilityZoneId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineInstallationMediaPath() != null)
            sb.append("EngineInstallationMediaPath: ").append(getEngineInstallationMediaPath()).append(",");
        if (getOSInstallationMediaPath() != null)
            sb.append("OSInstallationMediaPath: ").append(getOSInstallationMediaPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstallationMediaRequest == false)
            return false;
        ImportInstallationMediaRequest other = (ImportInstallationMediaRequest) obj;
        if (other.getCustomAvailabilityZoneId() == null ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineInstallationMediaPath() == null ^ this.getEngineInstallationMediaPath() == null)
            return false;
        if (other.getEngineInstallationMediaPath() != null && other.getEngineInstallationMediaPath().equals(this.getEngineInstallationMediaPath()) == false)
            return false;
        if (other.getOSInstallationMediaPath() == null ^ this.getOSInstallationMediaPath() == null)
            return false;
        if (other.getOSInstallationMediaPath() != null && other.getOSInstallationMediaPath().equals(this.getOSInstallationMediaPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineInstallationMediaPath() == null) ? 0 : getEngineInstallationMediaPath().hashCode());
        hashCode = prime * hashCode + ((getOSInstallationMediaPath() == null) ? 0 : getOSInstallationMediaPath().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstallationMediaRequest clone() {
        return (ImportInstallationMediaRequest) super.clone();
    }

}
