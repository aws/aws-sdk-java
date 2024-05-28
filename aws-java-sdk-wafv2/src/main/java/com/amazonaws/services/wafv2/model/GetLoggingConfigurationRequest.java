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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetLoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Used to distinguish between various logging options. Currently, there is one option.
     * </p>
     * <p>
     * Default: <code>WAF_LOGS</code>
     * </p>
     */
    private String logType;
    /**
     * <p>
     * The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations that
     * you manage.
     * </p>
     * <p>
     * The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security Lake.
     * You can use Security Lake to collect log and event data from various sources for normalization, analysis, and
     * management. For information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data from
     * Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     * </p>
     * <p>
     * Default: <code>CUSTOMER</code>
     * </p>
     */
    private String logScope;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the web ACL for which you want to get the <a>LoggingConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggingConfigurationRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Used to distinguish between various logging options. Currently, there is one option.
     * </p>
     * <p>
     * Default: <code>WAF_LOGS</code>
     * </p>
     * 
     * @param logType
     *        Used to distinguish between various logging options. Currently, there is one option.</p>
     *        <p>
     *        Default: <code>WAF_LOGS</code>
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * Used to distinguish between various logging options. Currently, there is one option.
     * </p>
     * <p>
     * Default: <code>WAF_LOGS</code>
     * </p>
     * 
     * @return Used to distinguish between various logging options. Currently, there is one option.</p>
     *         <p>
     *         Default: <code>WAF_LOGS</code>
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * Used to distinguish between various logging options. Currently, there is one option.
     * </p>
     * <p>
     * Default: <code>WAF_LOGS</code>
     * </p>
     * 
     * @param logType
     *        Used to distinguish between various logging options. Currently, there is one option.</p>
     *        <p>
     *        Default: <code>WAF_LOGS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public GetLoggingConfigurationRequest withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * Used to distinguish between various logging options. Currently, there is one option.
     * </p>
     * <p>
     * Default: <code>WAF_LOGS</code>
     * </p>
     * 
     * @param logType
     *        Used to distinguish between various logging options. Currently, there is one option.</p>
     *        <p>
     *        Default: <code>WAF_LOGS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public GetLoggingConfigurationRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations that
     * you manage.
     * </p>
     * <p>
     * The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security Lake.
     * You can use Security Lake to collect log and event data from various sources for normalization, analysis, and
     * management. For information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data from
     * Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     * </p>
     * <p>
     * Default: <code>CUSTOMER</code>
     * </p>
     * 
     * @param logScope
     *        The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations
     *        that you manage. </p>
     *        <p>
     *        The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security
     *        Lake. You can use Security Lake to collect log and event data from various sources for normalization,
     *        analysis, and management. For information, see <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data
     *        from Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>CUSTOMER</code>
     * @see LogScope
     */

    public void setLogScope(String logScope) {
        this.logScope = logScope;
    }

    /**
     * <p>
     * The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations that
     * you manage.
     * </p>
     * <p>
     * The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security Lake.
     * You can use Security Lake to collect log and event data from various sources for normalization, analysis, and
     * management. For information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data from
     * Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     * </p>
     * <p>
     * Default: <code>CUSTOMER</code>
     * </p>
     * 
     * @return The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations
     *         that you manage. </p>
     *         <p>
     *         The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon
     *         Security Lake. You can use Security Lake to collect log and event data from various sources for
     *         normalization, analysis, and management. For information, see <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data
     *         from Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>CUSTOMER</code>
     * @see LogScope
     */

    public String getLogScope() {
        return this.logScope;
    }

    /**
     * <p>
     * The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations that
     * you manage.
     * </p>
     * <p>
     * The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security Lake.
     * You can use Security Lake to collect log and event data from various sources for normalization, analysis, and
     * management. For information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data from
     * Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     * </p>
     * <p>
     * Default: <code>CUSTOMER</code>
     * </p>
     * 
     * @param logScope
     *        The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations
     *        that you manage. </p>
     *        <p>
     *        The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security
     *        Lake. You can use Security Lake to collect log and event data from various sources for normalization,
     *        analysis, and management. For information, see <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data
     *        from Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>CUSTOMER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogScope
     */

    public GetLoggingConfigurationRequest withLogScope(String logScope) {
        setLogScope(logScope);
        return this;
    }

    /**
     * <p>
     * The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations that
     * you manage.
     * </p>
     * <p>
     * The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security Lake.
     * You can use Security Lake to collect log and event data from various sources for normalization, analysis, and
     * management. For information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data from
     * Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     * </p>
     * <p>
     * Default: <code>CUSTOMER</code>
     * </p>
     * 
     * @param logScope
     *        The owner of the logging configuration, which must be set to <code>CUSTOMER</code> for the configurations
     *        that you manage. </p>
     *        <p>
     *        The log scope <code>SECURITY_LAKE</code> indicates a configuration that is managed through Amazon Security
     *        Lake. You can use Security Lake to collect log and event data from various sources for normalization,
     *        analysis, and management. For information, see <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Collecting data
     *        from Amazon Web Services services</a> in the <i>Amazon Security Lake user guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>CUSTOMER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogScope
     */

    public GetLoggingConfigurationRequest withLogScope(LogScope logScope) {
        this.logScope = logScope.toString();
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getLogScope() != null)
            sb.append("LogScope: ").append(getLogScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoggingConfigurationRequest == false)
            return false;
        GetLoggingConfigurationRequest other = (GetLoggingConfigurationRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getLogScope() == null ^ this.getLogScope() == null)
            return false;
        if (other.getLogScope() != null && other.getLogScope().equals(this.getLogScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getLogScope() == null) ? 0 : getLogScope().hashCode());
        return hashCode;
    }

    @Override
    public GetLoggingConfigurationRequest clone() {
        return (GetLoggingConfigurationRequest) super.clone();
    }

}
