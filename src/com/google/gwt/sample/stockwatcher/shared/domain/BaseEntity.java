package com.google.gwt.sample.stockwatcher.shared.domain;

@MappedSuperclass
public class BaseEntity {
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "BLOCKNEWS_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	public BaseEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
