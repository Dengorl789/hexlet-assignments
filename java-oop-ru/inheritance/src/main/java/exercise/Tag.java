package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
	private String tagType;
	private Map<String, String> tagAttributes;
	private SingleTag singleTag;

	public SingleTag getSingleTag() {
		return singleTag;
	}

	public void setSingleTag(SingleTag singleTag) {
		this.singleTag = singleTag;
	}

	public Tag(
			String tagType,
			Map<String, String> tagAttributes
	) {
			this.tagType = tagType;
			this.tagAttributes = tagAttributes;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public void setTagAttributes(Map<String, String> tagAttributes) {
		this.tagAttributes = tagAttributes;
	}

	public final String getTagType() {
		return tagType;
	}

	public final Map<String, String> getTagAttributes() {
		return tagAttributes;
	}

	@Override
	public abstract String toString();

}
// END
