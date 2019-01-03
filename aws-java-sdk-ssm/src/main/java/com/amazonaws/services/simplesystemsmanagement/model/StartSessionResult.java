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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * instance.
     * </p>
     */
    private String tokenValue;
    /**
     * <p>
     * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output
     * from the instance. Format:
     * <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     * </p>
     * <p>
     * <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     * <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the
     * <b>Region</b> column in the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS
     * Systems Manager table of regions and endpoints</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     * </p>
     */
    private String streamUrl;

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @return The ID of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param sessionId
     *        The ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * instance.
     * </p>
     * 
     * @param tokenValue
     *        An encrypted token value containing session and caller information. Used to authenticate the connection to
     *        the instance.
     */

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * instance.
     * </p>
     * 
     * @return An encrypted token value containing session and caller information. Used to authenticate the connection
     *         to the instance.
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     * <p>
     * An encrypted token value containing session and caller information. Used to authenticate the connection to the
     * instance.
     * </p>
     * 
     * @param tokenValue
     *        An encrypted token value containing session and caller information. Used to authenticate the connection to
     *        the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionResult withTokenValue(String tokenValue) {
        setTokenValue(tokenValue);
        return this;
    }

    /**
     * <p>
     * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output
     * from the instance. Format:
     * <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     * </p>
     * <p>
     * <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     * <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the
     * <b>Region</b> column in the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS
     * Systems Manager table of regions and endpoints</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     * </p>
     * 
     * @param streamUrl
     *        A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive
     *        output from the instance. Format:
     *        <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     *        </p>
     *        <p>
     *        <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     *        <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see
     *        the <b>Region</b> column in the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS Systems Manager table of
     *        regions and endpoints</a> in the <i>AWS General Reference</i>.
     *        </p>
     *        <p>
     *        <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     */

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    /**
     * <p>
     * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output
     * from the instance. Format:
     * <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     * </p>
     * <p>
     * <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     * <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the
     * <b>Region</b> column in the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS
     * Systems Manager table of regions and endpoints</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     * </p>
     * 
     * @return A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive
     *         output from the instance. Format:
     *         <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     *         </p>
     *         <p>
     *         <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such
     *         as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values,
     *         see the <b>Region</b> column in the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS Systems Manager table of
     *         regions and endpoints</a> in the <i>AWS General Reference</i>.
     *         </p>
     *         <p>
     *         <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     */

    public String getStreamUrl() {
        return this.streamUrl;
    }

    /**
     * <p>
     * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output
     * from the instance. Format:
     * <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     * </p>
     * <p>
     * <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     * <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the
     * <b>Region</b> column in the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS
     * Systems Manager table of regions and endpoints</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     * </p>
     * 
     * @param streamUrl
     *        A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive
     *        output from the instance. Format:
     *        <code>wss://ssm-messages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>
     *        </p>
     *        <p>
     *        <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as
     *        <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see
     *        the <b>Region</b> column in the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ssm_region">AWS Systems Manager table of
     *        regions and endpoints</a> in the <i>AWS General Reference</i>.
     *        </p>
     *        <p>
     *        <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionResult withStreamUrl(String streamUrl) {
        setStreamUrl(streamUrl);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTokenValue() != null)
            sb.append("TokenValue: ").append(getTokenValue()).append(",");
        if (getStreamUrl() != null)
            sb.append("StreamUrl: ").append(getStreamUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionResult == false)
            return false;
        StartSessionResult other = (StartSessionResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTokenValue() == null ^ this.getTokenValue() == null)
            return false;
        if (other.getTokenValue() != null && other.getTokenValue().equals(this.getTokenValue()) == false)
            return false;
        if (other.getStreamUrl() == null ^ this.getStreamUrl() == null)
            return false;
        if (other.getStreamUrl() != null && other.getStreamUrl().equals(this.getStreamUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTokenValue() == null) ? 0 : getTokenValue().hashCode());
        hashCode = prime * hashCode + ((getStreamUrl() == null) ? 0 : getStreamUrl().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionResult clone() {
        try {
            return (StartSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
