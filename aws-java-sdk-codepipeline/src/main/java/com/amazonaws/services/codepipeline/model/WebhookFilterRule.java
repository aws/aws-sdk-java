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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event criteria that specify when a webhook notification is sent to your URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/WebhookFilterRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebhookFilterRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath
     * expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More
     * information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
     * </p>
     */
    private String jsonPath;
    /**
     * <p>
     * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the
     * request will be ignored. Properties from the target action configuration can be included as placeholders in this
     * value by surrounding the action configuration key with curly braces. For example, if the value supplied here is
     * "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of
     * "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration
     * properties for built-in action types can be found here: <a href=
     * "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     * >Pipeline Structure Reference Action Requirements</a>.
     * </p>
     */
    private String matchEquals;

    /**
     * <p>
     * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath
     * expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More
     * information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
     * </p>
     * 
     * @param jsonPath
     *        A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by
     *        JsonPath expression must match the value specified in the matchEquals field, otherwise the request will be
     *        ignored. More information on JsonPath expressions can be found here:
     *        https://github.com/json-path/JsonPath.
     */

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath
     * expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More
     * information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
     * </p>
     * 
     * @return A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by
     *         JsonPath expression must match the value specified in the matchEquals field, otherwise the request will
     *         be ignored. More information on JsonPath expressions can be found here:
     *         https://github.com/json-path/JsonPath.
     */

    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * <p>
     * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath
     * expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More
     * information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
     * </p>
     * 
     * @param jsonPath
     *        A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by
     *        JsonPath expression must match the value specified in the matchEquals field, otherwise the request will be
     *        ignored. More information on JsonPath expressions can be found here:
     *        https://github.com/json-path/JsonPath.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookFilterRule withJsonPath(String jsonPath) {
        setJsonPath(jsonPath);
        return this;
    }

    /**
     * <p>
     * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the
     * request will be ignored. Properties from the target action configuration can be included as placeholders in this
     * value by surrounding the action configuration key with curly braces. For example, if the value supplied here is
     * "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of
     * "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration
     * properties for built-in action types can be found here: <a href=
     * "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     * >Pipeline Structure Reference Action Requirements</a>.
     * </p>
     * 
     * @param matchEquals
     *        The value selected by the JsonPath expression must match what is supplied in the MatchEquals field,
     *        otherwise the request will be ignored. Properties from the target action configuration can be included as
     *        placeholders in this value by surrounding the action configuration key with curly braces. For example, if
     *        the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration
     *        property called "Branch" with a value of "master", the MatchEquals value will be evaluated as
     *        "refs/heads/master". A list of action configuration properties for built-in action types can be found
     *        here: <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     *        >Pipeline Structure Reference Action Requirements</a>.
     */

    public void setMatchEquals(String matchEquals) {
        this.matchEquals = matchEquals;
    }

    /**
     * <p>
     * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the
     * request will be ignored. Properties from the target action configuration can be included as placeholders in this
     * value by surrounding the action configuration key with curly braces. For example, if the value supplied here is
     * "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of
     * "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration
     * properties for built-in action types can be found here: <a href=
     * "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     * >Pipeline Structure Reference Action Requirements</a>.
     * </p>
     * 
     * @return The value selected by the JsonPath expression must match what is supplied in the MatchEquals field,
     *         otherwise the request will be ignored. Properties from the target action configuration can be included as
     *         placeholders in this value by surrounding the action configuration key with curly braces. For example, if
     *         the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration
     *         property called "Branch" with a value of "master", the MatchEquals value will be evaluated as
     *         "refs/heads/master". A list of action configuration properties for built-in action types can be found
     *         here: <a href=
     *         "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     *         >Pipeline Structure Reference Action Requirements</a>.
     */

    public String getMatchEquals() {
        return this.matchEquals;
    }

    /**
     * <p>
     * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the
     * request will be ignored. Properties from the target action configuration can be included as placeholders in this
     * value by surrounding the action configuration key with curly braces. For example, if the value supplied here is
     * "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of
     * "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration
     * properties for built-in action types can be found here: <a href=
     * "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     * >Pipeline Structure Reference Action Requirements</a>.
     * </p>
     * 
     * @param matchEquals
     *        The value selected by the JsonPath expression must match what is supplied in the MatchEquals field,
     *        otherwise the request will be ignored. Properties from the target action configuration can be included as
     *        placeholders in this value by surrounding the action configuration key with curly braces. For example, if
     *        the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration
     *        property called "Branch" with a value of "master", the MatchEquals value will be evaluated as
     *        "refs/heads/master". A list of action configuration properties for built-in action types can be found
     *        here: <a href=
     *        "https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements"
     *        >Pipeline Structure Reference Action Requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookFilterRule withMatchEquals(String matchEquals) {
        setMatchEquals(matchEquals);
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
        if (getJsonPath() != null)
            sb.append("JsonPath: ").append(getJsonPath()).append(",");
        if (getMatchEquals() != null)
            sb.append("MatchEquals: ").append(getMatchEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebhookFilterRule == false)
            return false;
        WebhookFilterRule other = (WebhookFilterRule) obj;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        if (other.getMatchEquals() == null ^ this.getMatchEquals() == null)
            return false;
        if (other.getMatchEquals() != null && other.getMatchEquals().equals(this.getMatchEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        hashCode = prime * hashCode + ((getMatchEquals() == null) ? 0 : getMatchEquals().hashCode());
        return hashCode;
    }

    @Override
    public WebhookFilterRule clone() {
        try {
            return (WebhookFilterRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.WebhookFilterRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
