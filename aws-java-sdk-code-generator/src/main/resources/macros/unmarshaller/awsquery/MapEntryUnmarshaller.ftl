<#macro content memberModel >
    private static class ${memberModel.name}MapEntryUnmarshaller
           implements Unmarshaller<Map.Entry<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}>, StaxUnmarshallerContext> {

        @Override
        public Entry<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}> entry
                = new MapEntry<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument()) return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("${memberModel.mapModel.keyLocationName}", targetDepth)) {
                        entry.setKey(${memberModel.mapModel.keyType}StaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("${memberModel.mapModel.valueLocationName}", targetDepth)) {
                        <#if memberModel.mapModel.valueModel.variable.simpleType == "Date">
                        <#local timestampFormat = memberModel.timestampFormat />
                            entry.setValue(DateStaxUnmarshallerFactory.getInstance("${timestampFormat}").unmarshall(context));
                        <#else>
                             entry.setValue(${memberModel.mapModel.valueModel.variable.simpleType}StaxUnmarshaller.getInstance().unmarshall(context));
                        </#if>
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth) return entry;
                }
            }
        }

        private static ${memberModel.name}MapEntryUnmarshaller instance;
        public static ${memberModel.name}MapEntryUnmarshaller getInstance() {
            if (instance == null) instance = new ${memberModel.name}MapEntryUnmarshaller();
            return instance;
        }

    }
</#macro>