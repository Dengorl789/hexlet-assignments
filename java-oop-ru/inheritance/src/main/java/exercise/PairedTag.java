package exercise;

import javax.swing.*;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
	private String text;
	private List<Tag> list;

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
		result += ">" + getText();
		for(var childs: getList()) {
			result += childs;
		}
		result +="</" + tagName + ">";
		System.out.println(result);
		return result;
	}

	public PairedTag(
			String tagType,
			Map<String, String> tagAttributes,
			String text,
			List<Tag> list
	) {
			super(tagType, tagAttributes);
			this.text = text;
			this.list = list;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Tag> getList() {
		return list;
	}

	public void setList(List<Tag> list) {
		this.list = list;
	}
}
// END
