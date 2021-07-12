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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information required to connect to a ServiceNow data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ServiceNowConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNowConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     */
    private String hostUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password required to
     * connect to the ServiceNow instance.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the host is not running the
     * <code>LONDON</code> release, use <code>OTHERS</code>.
     * </p>
     */
    private String serviceNowBuildVersion;
    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the ServiceNow site.
     * </p>
     */
    private ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;
    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the ServiceNow site.
     * </p>
     */
    private ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;
    /**
     * <p>
     * Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     * <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the AWS
     * Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>, Amazon Kendra is
     * authenticated using the OAuth token and secret provided in the Secrets Manager secret, and the user name and
     * password are used to determine which information Amazon Kendra has access to.
     * </p>
     * <p>
     * When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     * source</a>.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * 
     * @param hostUrl
     *        The ServiceNow instance that the data source connects to. The host endpoint should look like the
     *        following: <code>{instance}.service-now.com.</code>
     */

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * 
     * @return The ServiceNow instance that the data source connects to. The host endpoint should look like the
     *         following: <code>{instance}.service-now.com.</code>
     */

    public String getHostUrl() {
        return this.hostUrl;
    }

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * 
     * @param hostUrl
     *        The ServiceNow instance that the data source connects to. The host endpoint should look like the
     *        following: <code>{instance}.service-now.com.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowConfiguration withHostUrl(String hostUrl) {
        setHostUrl(hostUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password required to
     * connect to the ServiceNow instance.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password
     *        required to connect to the ServiceNow instance.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password required to
     * connect to the ServiceNow instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password
     *         required to connect to the ServiceNow instance.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password required to
     * connect to the ServiceNow instance.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password
     *        required to connect to the ServiceNow instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the host is not running the
     * <code>LONDON</code> release, use <code>OTHERS</code>.
     * </p>
     * 
     * @param serviceNowBuildVersion
     *        The identifier of the release that the ServiceNow host is running. If the host is not running the
     *        <code>LONDON</code> release, use <code>OTHERS</code>.
     * @see ServiceNowBuildVersionType
     */

    public void setServiceNowBuildVersion(String serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the host is not running the
     * <code>LONDON</code> release, use <code>OTHERS</code>.
     * </p>
     * 
     * @return The identifier of the release that the ServiceNow host is running. If the host is not running the
     *         <code>LONDON</code> release, use <code>OTHERS</code>.
     * @see ServiceNowBuildVersionType
     */

    public String getServiceNowBuildVersion() {
        return this.serviceNowBuildVersion;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the host is not running the
     * <code>LONDON</code> release, use <code>OTHERS</code>.
     * </p>
     * 
     * @param serviceNowBuildVersion
     *        The identifier of the release that the ServiceNow host is running. If the host is not running the
     *        <code>LONDON</code> release, use <code>OTHERS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowBuildVersionType
     */

    public ServiceNowConfiguration withServiceNowBuildVersion(String serviceNowBuildVersion) {
        setServiceNowBuildVersion(serviceNowBuildVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the host is not running the
     * <code>LONDON</code> release, use <code>OTHERS</code>.
     * </p>
     * 
     * @param serviceNowBuildVersion
     *        The identifier of the release that the ServiceNow host is running. If the host is not running the
     *        <code>LONDON</code> release, use <code>OTHERS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowBuildVersionType
     */

    public ServiceNowConfiguration withServiceNowBuildVersion(ServiceNowBuildVersionType serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion.toString();
        return this;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the ServiceNow site.
     * </p>
     * 
     * @param knowledgeArticleConfiguration
     *        Provides configuration information for crawling knowledge articles in the ServiceNow site.
     */

    public void setKnowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the ServiceNow site.
     * </p>
     * 
     * @return Provides configuration information for crawling knowledge articles in the ServiceNow site.
     */

    public ServiceNowKnowledgeArticleConfiguration getKnowledgeArticleConfiguration() {
        return this.knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the ServiceNow site.
     * </p>
     * 
     * @param knowledgeArticleConfiguration
     *        Provides configuration information for crawling knowledge articles in the ServiceNow site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowConfiguration withKnowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        setKnowledgeArticleConfiguration(knowledgeArticleConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the ServiceNow site.
     * </p>
     * 
     * @param serviceCatalogConfiguration
     *        Provides configuration information for crawling service catalogs in the ServiceNow site.
     */

    public void setServiceCatalogConfiguration(ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
        this.serviceCatalogConfiguration = serviceCatalogConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the ServiceNow site.
     * </p>
     * 
     * @return Provides configuration information for crawling service catalogs in the ServiceNow site.
     */

    public ServiceNowServiceCatalogConfiguration getServiceCatalogConfiguration() {
        return this.serviceCatalogConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the ServiceNow site.
     * </p>
     * 
     * @param serviceCatalogConfiguration
     *        Provides configuration information for crawling service catalogs in the ServiceNow site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowConfiguration withServiceCatalogConfiguration(ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
        setServiceCatalogConfiguration(serviceCatalogConfiguration);
        return this;
    }

    /**
     * <p>
     * Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     * <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the AWS
     * Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>, Amazon Kendra is
     * authenticated using the OAuth token and secret provided in the Secrets Manager secret, and the user name and
     * password are used to determine which information Amazon Kendra has access to.
     * </p>
     * <p>
     * When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     * source</a>.
     * </p>
     * 
     * @param authenticationType
     *        Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     *        <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the
     *        AWS Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>,
     *        Amazon Kendra is authenticated using the OAuth token and secret provided in the Secrets Manager secret,
     *        and the user name and password are used to determine which information Amazon Kendra has access to.</p>
     *        <p>
     *        When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     *        ServiceNow console. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     *        source</a>.
     * @see ServiceNowAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     * <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the AWS
     * Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>, Amazon Kendra is
     * authenticated using the OAuth token and secret provided in the Secrets Manager secret, and the user name and
     * password are used to determine which information Amazon Kendra has access to.
     * </p>
     * <p>
     * When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     * source</a>.
     * </p>
     * 
     * @return Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     *         <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the
     *         AWS Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>,
     *         Amazon Kendra is authenticated using the OAuth token and secret provided in the Secrets Manager secret,
     *         and the user name and password are used to determine which information Amazon Kendra has access to.</p>
     *         <p>
     *         When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     *         ServiceNow console. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     *         source</a>.
     * @see ServiceNowAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     * <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the AWS
     * Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>, Amazon Kendra is
     * authenticated using the OAuth token and secret provided in the Secrets Manager secret, and the user name and
     * password are used to determine which information Amazon Kendra has access to.
     * </p>
     * <p>
     * When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     * source</a>.
     * </p>
     * 
     * @param authenticationType
     *        Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     *        <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the
     *        AWS Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>,
     *        Amazon Kendra is authenticated using the OAuth token and secret provided in the Secrets Manager secret,
     *        and the user name and password are used to determine which information Amazon Kendra has access to.</p>
     *        <p>
     *        When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     *        ServiceNow console. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     *        source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowAuthenticationType
     */

    public ServiceNowConfiguration withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     * <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the AWS
     * Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>, Amazon Kendra is
     * authenticated using the OAuth token and secret provided in the Secrets Manager secret, and the user name and
     * password are used to determine which information Amazon Kendra has access to.
     * </p>
     * <p>
     * When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     * source</a>.
     * </p>
     * 
     * @param authenticationType
     *        Determines the type of authentication used to connect to the ServiceNow instance. If you choose
     *        <code>HTTP_BASIC</code>, Amazon Kendra is authenticated using the user name and password provided in the
     *        AWS Secrets Manager secret in the <code>SecretArn</code> field. When you choose <code>OAUTH2</code>,
     *        Amazon Kendra is authenticated using the OAuth token and secret provided in the Secrets Manager secret,
     *        and the user name and password are used to determine which information Amazon Kendra has access to.</p>
     *        <p>
     *        When you use <code>OAUTH2</code> authentication, you must generate a token and a client secret using the
     *        ServiceNow console. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html">Using a ServiceNow data
     *        source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowAuthenticationType
     */

    public ServiceNowConfiguration withAuthenticationType(ServiceNowAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
        if (getHostUrl() != null)
            sb.append("HostUrl: ").append(getHostUrl()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getServiceNowBuildVersion() != null)
            sb.append("ServiceNowBuildVersion: ").append(getServiceNowBuildVersion()).append(",");
        if (getKnowledgeArticleConfiguration() != null)
            sb.append("KnowledgeArticleConfiguration: ").append(getKnowledgeArticleConfiguration()).append(",");
        if (getServiceCatalogConfiguration() != null)
            sb.append("ServiceCatalogConfiguration: ").append(getServiceCatalogConfiguration()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNowConfiguration == false)
            return false;
        ServiceNowConfiguration other = (ServiceNowConfiguration) obj;
        if (other.getHostUrl() == null ^ this.getHostUrl() == null)
            return false;
        if (other.getHostUrl() != null && other.getHostUrl().equals(this.getHostUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getServiceNowBuildVersion() == null ^ this.getServiceNowBuildVersion() == null)
            return false;
        if (other.getServiceNowBuildVersion() != null && other.getServiceNowBuildVersion().equals(this.getServiceNowBuildVersion()) == false)
            return false;
        if (other.getKnowledgeArticleConfiguration() == null ^ this.getKnowledgeArticleConfiguration() == null)
            return false;
        if (other.getKnowledgeArticleConfiguration() != null
                && other.getKnowledgeArticleConfiguration().equals(this.getKnowledgeArticleConfiguration()) == false)
            return false;
        if (other.getServiceCatalogConfiguration() == null ^ this.getServiceCatalogConfiguration() == null)
            return false;
        if (other.getServiceCatalogConfiguration() != null && other.getServiceCatalogConfiguration().equals(this.getServiceCatalogConfiguration()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getServiceNowBuildVersion() == null) ? 0 : getServiceNowBuildVersion().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeArticleConfiguration() == null) ? 0 : getKnowledgeArticleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServiceCatalogConfiguration() == null) ? 0 : getServiceCatalogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public ServiceNowConfiguration clone() {
        try {
            return (ServiceNowConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ServiceNowConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
