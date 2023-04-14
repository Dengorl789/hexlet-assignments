package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{

	@Override
	public String toString() {
		String tagName = getTagType();
		Map<String, String> tagAttributes = getTagAttributes();
		String result = "<" + tagName;
		for(Map.Entry<String, String> attributePair: tagAttributes.entrySet()) {
			var key = attributePair.getKey();
			var value = attributePair.getValue();
			result += " " + key + "=" + "\"" + value + "\"";
		}
		result += ">";
		System.out.println(result);
		return result;
	}

	public SingleTag(String tagType, Map<String, String> tagAttributes) {
		super(tagType, tagAttributes);
	}
}
// END
