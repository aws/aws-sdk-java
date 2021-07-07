/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a portal summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PortalSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the portal.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the portal.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The portal's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     */
    private String startUrl;
    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String roleArn;

    private PortalStatus status;

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @param id
     *        The ID of the portal.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @return The ID of the portal.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @param id
     *        The ID of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @param name
     *        The name of the portal.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @return The name of the portal.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @param name
     *        The name of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @param description
     *        The portal's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @return The portal's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @param description
     *        The portal's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @param startUrl
     *        The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *        Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *        SiteWise console to get a URL that you can use to access the portal.
     */

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @return The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *         Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *         SiteWise console to get a URL that you can use to access the portal.
     */

    public String getStartUrl() {
        return this.startUrl;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @param startUrl
     *        The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *        Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *        SiteWise console to get a URL that you can use to access the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withStartUrl(String startUrl) {
        setStartUrl(startUrl);
        return this;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the portal was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the portal was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the portal was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the portal was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the portal was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the portal was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *         roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(PortalStatus status) {
        this.status = status;
    }

    /**
     * @return
     */

    public PortalStatus getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalSummary withStatus(PortalStatus status) {
        setStatus(status);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStartUrl() != null)
            sb.append("StartUrl: ").append(getStartUrl()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortalSummary == false)
            return false;
        PortalSummary other = (PortalSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartUrl() == null ^ this.getStartUrl() == null)
            return false;
        if (other.getStartUrl() != null && other.getStartUrl().equals(this.getStartUrl()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartUrl() == null) ? 0 : getStartUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PortalSummary clone() {
        try {
            return (PortalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PortalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
