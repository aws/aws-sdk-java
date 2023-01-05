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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters required to set up enrichment on your pipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeEnrichmentParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeEnrichmentParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination.
     * </p>
     * <p>
     * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to
     * specify headers, path parameters, and query string keys/values as part of your target invoking request. If you're
     * using ApiDestinations, the corresponding Connection can also have these values configured. In case of any
     * conflicting keys, values from the Connection take precedence.
     * </p>
     */
    private PipeEnrichmentHttpParameters httpParameters;
    /**
     * <p>
     * Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     * enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     * Notation (JSON) Data Interchange Format</a>.
     * </p>
     */
    private String inputTemplate;

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination.
     * </p>
     * <p>
     * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to
     * specify headers, path parameters, and query string keys/values as part of your target invoking request. If you're
     * using ApiDestinations, the corresponding Connection can also have these values configured. In case of any
     * conflicting keys, values from the Connection take precedence.
     * </p>
     * 
     * @param httpParameters
     *        Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge
     *        ApiDestination.</p>
     *        <p>
     *        If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this
     *        parameter to specify headers, path parameters, and query string keys/values as part of your target
     *        invoking request. If you're using ApiDestinations, the corresponding Connection can also have these values
     *        configured. In case of any conflicting keys, values from the Connection take precedence.
     */

    public void setHttpParameters(PipeEnrichmentHttpParameters httpParameters) {
        this.httpParameters = httpParameters;
    }

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination.
     * </p>
     * <p>
     * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to
     * specify headers, path parameters, and query string keys/values as part of your target invoking request. If you're
     * using ApiDestinations, the corresponding Connection can also have these values configured. In case of any
     * conflicting keys, values from the Connection take precedence.
     * </p>
     * 
     * @return Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge
     *         ApiDestination.</p>
     *         <p>
     *         If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this
     *         parameter to specify headers, path parameters, and query string keys/values as part of your target
     *         invoking request. If you're using ApiDestinations, the corresponding Connection can also have these
     *         values configured. In case of any conflicting keys, values from the Connection take precedence.
     */

    public PipeEnrichmentHttpParameters getHttpParameters() {
        return this.httpParameters;
    }

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination.
     * </p>
     * <p>
     * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to
     * specify headers, path parameters, and query string keys/values as part of your target invoking request. If you're
     * using ApiDestinations, the corresponding Connection can also have these values configured. In case of any
     * conflicting keys, values from the Connection take precedence.
     * </p>
     * 
     * @param httpParameters
     *        Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge
     *        ApiDestination.</p>
     *        <p>
     *        If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this
     *        parameter to specify headers, path parameters, and query string keys/values as part of your target
     *        invoking request. If you're using ApiDestinations, the corresponding Connection can also have these values
     *        configured. In case of any conflicting keys, values from the Connection take precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeEnrichmentParameters withHttpParameters(PipeEnrichmentHttpParameters httpParameters) {
        setHttpParameters(httpParameters);
        return this;
    }

    /**
     * <p>
     * Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     * enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     * Notation (JSON) Data Interchange Format</a>.
     * </p>
     * 
     * @param inputTemplate
     *        Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     *        enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript
     *        Object Notation (JSON) Data Interchange Format</a>.
     */

    public void setInputTemplate(String inputTemplate) {
        this.inputTemplate = inputTemplate;
    }

    /**
     * <p>
     * Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     * enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     * Notation (JSON) Data Interchange Format</a>.
     * </p>
     * 
     * @return Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     *         enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript
     *         Object Notation (JSON) Data Interchange Format</a>.
     */

    public String getInputTemplate() {
        return this.inputTemplate;
    }

    /**
     * <p>
     * Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     * enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     * Notation (JSON) Data Interchange Format</a>.
     * </p>
     * 
     * @param inputTemplate
     *        Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the
     *        enrichment. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript
     *        Object Notation (JSON) Data Interchange Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeEnrichmentParameters withInputTemplate(String inputTemplate) {
        setInputTemplate(inputTemplate);
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
        if (getHttpParameters() != null)
            sb.append("HttpParameters: ").append(getHttpParameters()).append(",");
        if (getInputTemplate() != null)
            sb.append("InputTemplate: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeEnrichmentParameters == false)
            return false;
        PipeEnrichmentParameters other = (PipeEnrichmentParameters) obj;
        if (other.getHttpParameters() == null ^ this.getHttpParameters() == null)
            return false;
        if (other.getHttpParameters() != null && other.getHttpParameters().equals(this.getHttpParameters()) == false)
            return false;
        if (other.getInputTemplate() == null ^ this.getInputTemplate() == null)
            return false;
        if (other.getInputTemplate() != null && other.getInputTemplate().equals(this.getInputTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpParameters() == null) ? 0 : getHttpParameters().hashCode());
        hashCode = prime * hashCode + ((getInputTemplate() == null) ? 0 : getInputTemplate().hashCode());
        return hashCode;
    }

    @Override
    public PipeEnrichmentParameters clone() {
        try {
            return (PipeEnrichmentParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeEnrichmentParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
